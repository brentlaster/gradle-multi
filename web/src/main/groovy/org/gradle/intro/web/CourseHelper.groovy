package org.gradle.intro.web

import org.gradle.intro.service.CourseService
 
class CourseHelper {
	def service = new CourseService()

	String getGroovyValue() {
		service.findGradle()?.name ?: 'Gradle course not found'
	}
}