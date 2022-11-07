package org.example;

import java.util.List;
// 여러개의 정보만 가진 클래스
public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        //(학점수 + 교과목 평점)의 합계
        return courses.stream()
                .mapToDouble(Course ::multiplyCreditAndCourseGrade)
                        .sum();
//        double multipliedCreditAndCoursesGrade = 0;
//        //for 문 안에 있는 로직이 응집도가 약하다고 볼 수 있다. ->리팩토링한다면
//        for(Course course : courses){
////            multipliedCreditAndCoursesGrade += course.getCredit() * course.getGradeToNumber();
//            multipliedCreditAndCoursesGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCoursesGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()  //돌면서 과목 총 갯수 구함
                .mapToInt(Course::getCredit)
                .sum();
    }

}
