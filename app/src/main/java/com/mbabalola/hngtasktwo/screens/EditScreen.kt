package com.mbabalola.hngtasktwo.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mbabalola.hngtasktwo.Screen
import com.mbabalola.hngtasktwo.viewmodel.TestViewModel
import java.util.jar.Attributes.Name

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditScreen(
    navController: NavController,
    testViewModel: TestViewModel
) {

    var newNameText by remember { mutableStateOf( "") }
    var newSlackText by remember { mutableStateOf("") }
    var newGithubText by remember { mutableStateOf("") }
    var newBioText by remember { mutableStateOf("") }
    var newEducationText by remember { mutableStateOf("") }
    var newSkillsText by remember { mutableStateOf("") }

    val context = LocalContext.current

   Column(
       modifier = Modifier.fillMaxSize(),
   ) {
       TextField(
           modifier = Modifier
               .width(350.dp)
               .align(Alignment.CenterHorizontally)
               .padding(top = 20.dp),
           value = newNameText,
           onValueChange = { newNameText = it },
           label = { Text(text = "Enter name") },
           maxLines = 1,
           colors = TextFieldDefaults.textFieldColors(
               focusedTextColor = Color.Black,
               unfocusedTextColor = Color.Black,
               containerColor = Color.White,
               focusedLabelColor = Color.Black,
               unfocusedLabelColor = Color.Black
           )
       )
       TextField(
           modifier = Modifier
               .width(350.dp)
               .align(Alignment.CenterHorizontally)
               .padding(top = 15.dp),
           value = newSlackText,
           onValueChange = { newSlackText = it },
           label = { Text(text = "Enter slack username") },
           maxLines = 1,
           colors = TextFieldDefaults.textFieldColors(
               focusedTextColor = Color.Black,
               unfocusedTextColor = Color.Black,
               containerColor = Color.White,
               focusedLabelColor = Color.Black,
               unfocusedLabelColor = Color.Black
           )
       )
       TextField(
           modifier = Modifier
               .width(350.dp)
               .align(Alignment.CenterHorizontally)
               .padding(top = 15.dp),
           value = newGithubText,
           onValueChange = { newGithubText = it },
           label = { Text(text = "Enter github handle") },
           maxLines = 1,
           colors = TextFieldDefaults.textFieldColors(
               focusedTextColor = Color.Black,
               unfocusedTextColor = Color.Black,
               containerColor = Color.White,
               focusedLabelColor = Color.Black,
               unfocusedLabelColor = Color.Black
           )
       )
       TextField(
           modifier = Modifier
               .width(350.dp)
               .height(100.dp)
               .align(Alignment.CenterHorizontally)
               .padding(top = 15.dp),
           value = newBioText,
           onValueChange = { newBioText = it },
           label = { Text(text = "Enter personal bio") },
           maxLines = 3,
           colors = TextFieldDefaults.textFieldColors(
               focusedTextColor = Color.Black,
               unfocusedTextColor = Color.Black,
               containerColor = Color.White,
               focusedLabelColor = Color.Black,
               unfocusedLabelColor = Color.Black
           )
       )
       TextField(
           modifier = Modifier
               .width(350.dp)
               .height(100.dp)
               .align(Alignment.CenterHorizontally)
               .padding(top = 15.dp),
           value = newEducationText,
           onValueChange = { newEducationText = it },
           label = { Text(text = "Enter education level") },
           maxLines = 3,
           colors = TextFieldDefaults.textFieldColors(
               focusedTextColor = Color.Black,
               unfocusedTextColor = Color.Black,
               containerColor = Color.White,
               focusedLabelColor = Color.Black,
               unfocusedLabelColor = Color.Black
           )
       )
       TextField(
           modifier = Modifier
               .width(350.dp)
               .height(100.dp)
               .align(Alignment.CenterHorizontally)
               .padding(top = 15.dp),
           value = newSkillsText,
           onValueChange = { newSkillsText = it },
           label = { Text(text = "Enter skills") },
           maxLines = 2,
           colors = TextFieldDefaults.textFieldColors(
               focusedTextColor = Color.Black,
               unfocusedTextColor = Color.Black,
               containerColor = Color.White,
               focusedLabelColor = Color.Black,
               unfocusedLabelColor = Color.Black
           )
       )
       Spacer(modifier = Modifier.height(30.dp))
       Button(
           modifier = Modifier
               .align(Alignment.CenterHorizontally)
               .height(50.dp),
           onClick = {
               testViewModel.changeName(newNameText)
               testViewModel.changeSlackUsername(newSlackText)
               testViewModel.changeGitHubHandle(newGithubText)
               testViewModel.changeBio(newBioText)
               testViewModel.changeEducation(newEducationText)
               testViewModel.changeSkills(newSkillsText)
               Toast.makeText(context, "Changes made successfully", Toast.LENGTH_SHORT).show()
               navController.navigate(Screen.Home.route)
           }
       ) {
           Text(
               text = "Save changes",
               style = TextStyle(
                   fontSize = MaterialTheme.typography.bodyLarge.fontSize
               )
           )
       }
   }
}

@Composable
@Preview(showBackground = true)
fun EditScreenPreview() {
    val navController = rememberNavController()
    val testViewModel = TestViewModel()

    EditScreen(navController = navController, testViewModel = testViewModel)
}