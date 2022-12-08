package streamy.zadanie2;

import java.util.List;
import java.util.stream.Collectors;

  public  class School {
        private List<SchoolClass> classes;

        public List<Student> getStudents() {
            return classes.stream()
                    .flatMap(schoolClass -> schoolClass.getStudents().stream())
                    .collect(Collectors.toList());
        }
    }




















