package com.github.d3r1w.d3r1wcomposerjson.services

import com.intellij.openapi.project.Project
import com.github.d3r1w.d3r1wcomposerjson.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
