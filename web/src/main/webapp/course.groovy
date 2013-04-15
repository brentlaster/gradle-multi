import org.gradle.intro.web.CourseHelper

def helper = new CourseHelper()
 
html.html {
	head {
		title "Course info page"
	}
	body {
		h1 "Course info"
		p "This course is '$helper.groovyValue'."
	}
}