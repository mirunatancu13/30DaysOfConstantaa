package com.example.a30daysapp2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysapp2.data.Place
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.example.a30daysapp2.data.DataSource
import com.example.a30daysapp2.data.PlaceType
import com.example.compose.AppTheme
import com.example.compose.BlueDarkDark
import com.example.compose.BlueLightDark
import com.example.compose.BlueDark
import com.example.compose.BlueLight
import com.example.compose.OrangeDark
import com.example.compose.OrangeLight
import com.example.compose.BgLight
import com.example.compose.BgDark


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = if (isSystemInDarkTheme()) BgDark else BgLight
                ) {
                     PlacesApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun PlacesApp() {
    val layoutDirection = LocalLayoutDirection.current

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(if (isSystemInDarkTheme()) BgDark else BgLight)
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing.asPaddingValues()
                    .calculateStartPadding(layoutDirection),
                end = WindowInsets.safeDrawing.asPaddingValues()
                    .calculateEndPadding(layoutDirection),
            ),
        topBar = {
            ConstantaTopBar()
        },
        content = { innerPadding ->
            PlacesList(
                placeList = DataSource().loadPlaces(),
                modifier = Modifier.padding(innerPadding)
            )
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConstantaTopBar(
    modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(8.dp),
                    painter = painterResource(R.drawable.logonouconstanta),
                    contentDescription = null
                )
                Column(){
                    Text(
                        text = stringResource(R.string.titlu_logo1),
                        color = Color(0xFFFFFFFF),
                        style = MaterialTheme.typography.displayMedium
                    )
                    Text(
                        text = stringResource(R.string.titlu_logo2),
                        color = Color(0xFFFFFFFF),
                        style = MaterialTheme.typography.displayLarge
                    )
                }
            }
        },
        modifier = modifier,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = if (isSystemInDarkTheme()) OrangeDark else OrangeLight,
            titleContentColor = Color(0xFFFFFFFF)
        )
    )
}


@Composable
fun PlacesList(placeList: List<Place>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(if (isSystemInDarkTheme()) BgDark else BgLight)
    ) {
        items(placeList) { place ->
            PlaceCard(
                place = place,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}



@Composable
fun PlaceCard(place: Place, modifier: Modifier = Modifier) {
    val title = stringResource(place.titleRes)
    val isDark = isSystemInDarkTheme()

    val cardColor = when (place.type) {
        PlaceType.THEN -> if (isDark) BlueDarkDark else BlueDark
        PlaceType.NOW -> if (isDark) BlueLightDark else BlueLight
    }

    Card(modifier = modifier
        .padding(8.dp),
        shape = RoundedCornerShape(
            topStart = 15.dp,
            topEnd = 50.dp,
            bottomStart = 50.dp,
            bottomEnd = 15.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = cardColor,
            contentColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(place.dayNumberRes),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.displayLarge,
            )
            Text(
                text = stringResource(place.titleRes),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.displayMedium
            )
            TapImageWithDescription(
                painter = painterResource(place.imageRes),
                description = stringResource(place.descRes),
                modifier = Modifier
                    .width(400.dp)
                    .height(300.dp)
                    .padding(8.dp)
            )
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun PlaceCardPreview() {
//    PlaceCard(Place(R.string.day1, R.string.casadecultura1_title, R.string.casadecultura1_desc, R.drawable.casadeculturaconstanta1))
//}

@Composable
fun TapImageWithDescription(
    painter: Painter,
    description: String,
    modifier: Modifier = Modifier
) {
    val showDescription = remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                showDescription.value = !showDescription.value
            }
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Icon(
            imageVector = Icons.Default.Info,
            contentDescription = "Tap for more",
            tint = Color.White,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
                .size(24.dp)
        )
        AnimatedVisibility(
            visible = showDescription.value,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = description,
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}
