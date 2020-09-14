package github.informramiz.composeapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import github.informramiz.composeapplication.ui.ComposeApplicationTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    val image = imageResource(R.drawable.header)
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            image,
            modifier = Modifier
                .preferredHeight(180.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Text("A day in rainy water")
        Text("Paris, France")
        Text("September 2020")
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    NewsStory()
}