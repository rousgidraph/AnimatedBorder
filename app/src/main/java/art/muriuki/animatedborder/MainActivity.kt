package art.muriuki.animatedborder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import art.muriuki.animatedborder.ui.theme.AnimatedBorderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedBorderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxHeight(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        AnimatedBorderCard(
                            modifier = Modifier
                            .heightIn(min = 200.dp, max = 500.dp)
                                .padding(24.dp),
                            content = { CardContent() },
//                            gradient = Brush.sweepGradient(listOf(Color.Magenta, Color.Cyan)),
                            gradient = Brush.linearGradient(listOf(Color.Magenta, Color.Cyan)),
                            shape = RoundedCornerShape(8.dp)
                        )
                        Spacer(Modifier.height(12.dp))

                        AnimatedBorderCard(
                            modifier = Modifier
                                .heightIn(min = 200.dp, max = 500.dp)
                                .padding(24.dp),
                            content = { CardContent() },
//                            gradient = Brush.sweepGradient(listOf(Color.Magenta, Color.Cyan)),
                            gradient = Brush.verticalGradient (listOf(Color.Magenta, Color.Cyan)),
                            shape = RoundedCornerShape(8.dp)
                        )

                        Spacer(Modifier.height(12.dp))

                        AnimatedBorderCard(
                            modifier = Modifier
                                .heightIn(min = 200.dp, max = 500.dp)
                                .padding(24.dp),
                            content = { CardContent() },
//                            gradient = Brush.sweepGradient(listOf(Color.Magenta, Color.Cyan)),
                            gradient = Brush.sweepGradient (listOf(Color.Magenta, Color.Cyan)),
                            shape = RoundedCornerShape(8.dp)
                        )
                    }


                }
            }
        }
    }
}

