package hello
import spock.lang.Specification

class PersonSpec extends Specification {

    def "increase salary"() {
        setup: "a new Person instance is created"
            def person = new Person()
	    person.salary = 40

        when:
            def s = person.increaseSalary()

        then:
            s == 80
    }
}