package org.gradle.intro.service
 
import org.gradle.intro.domain.Course
import org.gradle.intro.data.CourseDao
 
class CourseService {
	def dao = new CourseDao()
 
	Course findGradle() {
		dao.findAll().find { it.name == 'Gradle Basics' }
	}
}