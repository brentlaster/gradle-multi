package org.gradle.intro.data
 
import org.gradle.intro.domain.Course
 
class CourseDao {
	List findAll() {
		[new Course(name: 'Git Basics'), new Course(name: 'Gradle Basics'), new Course(name: 'Jenkins Basics')]
	}
}