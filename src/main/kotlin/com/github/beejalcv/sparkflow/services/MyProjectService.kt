package com.github.beejalcv.sparkflow.services

import com.github.beejalcv.sparkflow.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
