package com.angelika.jetpackcomposelesson2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelika.jetpackcomposelesson2.ui.theme.Blue
import com.angelika.jetpackcomposelesson2.ui.theme.DarkGrey
import com.angelika.jetpackcomposelesson2.ui.theme.Grey
import com.angelika.jetpackcomposelesson2.ui.theme.JetpackComposeLesson2Theme
import com.angelika.jetpackcomposelesson2.ui.theme.LightBlue
import com.angelika.jetpackcomposelesson2.ui.theme.LightGrey
import com.angelika.jetpackcomposelesson2.ui.theme.LightGrey2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLesson2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BoxContainer()
                }
            }
        }
    }
}

@Composable
fun BoxContainer(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(348.dp),
            painter = painterResource(id = R.drawable.image_night_city),
            contentDescription = stringResource(
                R.string.image_night_city
            ),
            contentScale = ContentScale.FillBounds
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(528.dp)
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(
                topStart = 22.dp,
                topEnd = 22.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp),
                    text = stringResource(R.string.text_sunday_19_may_2019_9_30pm),
                    color = Color(LightGrey.value),
                    fontSize = 16.sp
                )
                Button(
                    modifier = Modifier
                        .height(48.dp)
                        .width(136.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = LightBlue),
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 22.dp,
                        bottomStart = 22.dp,
                        bottomEnd = 0.dp
                    ),
                    onClick = {}
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = stringResource(R.string.button_text_location),
                        color = Color(Blue.value),
                        fontSize = 13.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 40.dp, end = 40.dp)
                    .fillMaxWidth()
                    .height(66.dp)
            ) {
                Column(modifier = Modifier) {
                    Icon(
                        modifier = Modifier.padding(start = 40.dp),
                        painter = painterResource(id = R.drawable.ic_cloudy_and_moon),
                        contentDescription = stringResource(R.string.text_cloudy),
                        tint = Color(LightGrey2.value)
                    )
                    Text(
                        modifier = Modifier.padding(start = 34.dp),
                        text = stringResource(R.string.text_cloudy_),
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(start = 66.dp),
                    text = stringResource(R.string.text_29),
                    fontSize = 62.sp,
                    color = Color.Black
                )
                Text(
                    modifier = Modifier.padding(top = 12.dp),
                    text = stringResource(R.string.text_c),
                    color = Color(Grey.value),
                    fontSize = 28.sp
                )
                Column(modifier = Modifier.padding(start = 50.dp)) {
                    Text(
                        modifier = Modifier.padding(top = 6.dp),
                        text = stringResource(R.string.text_temperature_number_one),
                        color = Color(Grey.value),
                        fontSize = 18.sp
                    )
                    Text(
                        modifier = Modifier.padding(top = 14.dp),
                        text = stringResource(R.string.text_temperature_number_two),
                        color = Color(Grey.value),
                        fontSize = 18.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 40.dp, start = 40.dp, end = 40.dp)
                    .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MyContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_humidity),
                    contentDescription = stringResource(R.string.content_description_humidity),
                    text1 = stringResource(R.string.text_73),
                    text2 = stringResource(R.string.text_humidity)
                )
                MyContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_barometer),
                    contentDescription = stringResource(R.string.content_description_pressure),
                    text1 = stringResource(R.string.text_1_009mbar),
                    text2 = stringResource(R.string.text_pressure)
                )
                MyContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_wind),
                    contentDescription = stringResource(R.string.content_description_wind),
                    text1 = stringResource(R.string.text_11km_h),
                    text2 = stringResource(R.string.text_wind)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 40.dp, start = 40.dp, end = 40.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MyContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_sunrice),
                    contentDescription = stringResource(R.string.content_description_sunrice),
                    text1 = stringResource(R.string.text_6_03_am),
                    text2 = stringResource(R.string.text_sunrise)
                )
                MyContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_sunset),
                    contentDescription = stringResource(R.string.content_description_sunset),
                    text1 = stringResource(R.string.text_7_05_pm),
                    text2 = stringResource(R.string.text_sunset)
                )
                MyContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_daytime),
                    contentDescription = stringResource(R.string.content_description_daytime),
                    text1 = stringResource(R.string.text_13h_1m),
                    text2 = stringResource(R.string.text_daytime)
                )
            }

            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MyCardContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_sunny),
                    contentDescription = stringResource(R.string.content_description_sun),
                    text1 = stringResource(R.string.text_mon_21),
                    text2 = stringResource(R.string.text_35_c_26_c)
                )
                MyCardContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_cloudy),
                    contentDescription = stringResource(R.string.content_description_cloudy),
                    text1 = stringResource(R.string.text_tue_22),
                    text2 = stringResource(R.string.text_35_c_27_c)
                )
                MyCardContainer(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_hazy),
                    contentDescription = stringResource(R.string.content_description_hazy),
                    text1 = stringResource(R.string.text_wed_22),
                    text2 = stringResource(R.string.text_34_c_29_c)
                )
            }
        }
    }
}

@Composable
fun MyContainer(
    modifier: Modifier,
    painter: Painter,
    contentDescription: String,
    text1: String,
    text2: String
) {
    Column {
        Icon(
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .height(25.dp)
                .width(25.dp),
            painter = painter,
            contentDescription = contentDescription,
            tint = Color(LightGrey2.value)
        )
        Text(
            modifier = modifier
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally),
            text = text1,
            fontSize = 16.sp,
            color = Color(DarkGrey.value)
        )
        Text(
            modifier = modifier
                .align(Alignment.CenterHorizontally),
            text = text2,
            fontSize = 10.sp,
            color = Color(LightGrey.value)
        )
    }
}

@Composable
fun MyCardContainer(
    modifier: Modifier,
    painter: Painter,
    contentDescription: String,
    text1: String,
    text2: String
) {
    Card(
        modifier = modifier
            .width(90.dp)
            .height(90.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Icon(
            modifier = modifier
                .padding(top = 10.dp, start = 32.dp),
            painter = painter,
            contentDescription = contentDescription,
            tint = Color(LightGrey2.value)
        )
        Text(
            modifier = modifier
                .padding(top = 10.dp, start = 18.dp),
            text = text1,
            color = Color(DarkGrey.value),
            fontSize = 16.sp
        )
        Text(
            modifier = modifier
                .padding(start = 18.dp),
            text = text2,
            fontSize = 10.sp,
            color = Color(LightGrey.value)
        )
    }
}

@Preview
@Composable
fun PreviewBoxContainer() {
    BoxContainer(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
}