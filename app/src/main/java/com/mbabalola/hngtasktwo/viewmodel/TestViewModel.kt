package com.mbabalola.hngtasktwo.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class TestViewModel() : ViewModel() {

    var name by mutableStateOf<String?>("Edewusi Babalola Martins")
    private set

    var slackUsername by mutableStateOf<String?>("Edewusi Babalola Martins")
    private set

    var githubHandle by mutableStateOf<String?>("EBMartins7")
    private set

    var personalBio by mutableStateOf<String?>("I am an intermediate mobile developer from Nigeria." +
            " I am currently an intern in the HNGx internship program where I plan to hone my skills even better." +
            " I plan to build amazing and problem solving applications very soon in the future.")
    private set

    var education by mutableStateOf<String?>(
            "Our Glorious Academy, Port Harcourt, Rivers State"
    )
    private set

    var skill by mutableStateOf<String?>(
            "Software engineering.\n" +
                    "Analytical skills.\n" +
                    "Open-mindedness. \n" +
                    "Android development and architecture. \n" +
                    "Databases. \n" +
                    "Android SDK. \n" +
                    "IntelliJ IDEA. \n" +
                    "User experience design."
    )
    private set


    fun changeName(newName: String) {
        if (newName.isEmpty()) {
            name = name
        } else {
            name = newName
        }
    }

    fun changeSlackUsername(newUsername: String) {
        if (newUsername.isEmpty()) {
            slackUsername = slackUsername
        } else {
            slackUsername = newUsername
        }
    }

    fun changeGitHubHandle(newHandle: String) {
        if (newHandle.isEmpty()) {
            githubHandle = githubHandle
        } else {
            githubHandle = newHandle
        }
    }

    fun changeBio(newBio: String) {
        if (newBio.isEmpty()) {
            personalBio = personalBio
        } else {
            personalBio = newBio
        }
    }

    fun changeEducation(newEd: String) {
        if (newEd.isEmpty()) {
            education = education
        } else {
            education = newEd
        }
    }

    fun changeSkills(newSkills: String) {
        if (newSkills.isEmpty()) {
            skill = skill
        } else {
            skill = newSkills
        }
    }


}