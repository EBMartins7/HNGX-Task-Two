package com.mbabalola.hngtasktwo.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.RectangleShape
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mbabalola.hngtasktwo.Screen
import com.mbabalola.hngtasktwo.viewmodel.TestViewModel

@Composable
fun HomeScreen(
    navController: NavController,
    testViewModel: TestViewModel,
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        testViewModel.name?.let { name ->
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 10.dp),
                text = name,
                style = TextStyle(
                    fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            )
        }
            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                testViewModel.slackUsername?.let { slackUsername ->
                    Text(
                        text = slackUsername,
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))
                testViewModel.githubHandle?.let { githubHandle ->
                    Text(
                        text = githubHandle,
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                modifier = Modifier.padding(start = 5.dp),
                text = "Bio:",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                )
            )
            testViewModel.personalBio?.let { personalBio ->
                Text(
                    modifier = Modifier.padding(start = 5.dp),
                    text = personalBio,
                )
            }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(start = 5.dp),
            text = "Education:",
            style = TextStyle(
                fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
            )
        )
        testViewModel.education?.let {
            Text(
                modifier = Modifier.padding(start = 5.dp),
                text = it
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(start = 5.dp),
            text = "Skills:",
            style = TextStyle(
                fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
            )
        )
        testViewModel.skill?.let {
            Text(
                modifier = Modifier.padding(5.dp),
                text = it
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(50.dp),
            onClick = {
                navController.navigate(Screen.Edit.route)
            }
        ) {
            Text(
                text = "Modify details",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                )
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(
) {
    val navController = rememberNavController()
    val testViewModel = TestViewModel()

    HomeScreen(navController = navController, testViewModel = testViewModel)

}