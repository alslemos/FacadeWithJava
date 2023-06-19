
public class ShopKeeper {
	 private GradeReportByLecture lectureA;
	    private GradeReportByLecture lectureB;
	    private GradeReportByLecture lectureC;

	    /**
	     * no args constructor
	     */
	    public ShopKeeper() {
	    	lectureA = new LectureA();
	    	lectureB = new LectureB();
	    	lectureC = new LectureC();
	    }

	    public void lectureAData() {
	    	lectureA.getLectureGrade();
	    	lectureA.getTeacherName();
	    }

	    public void lectureBData() {
	    	lectureB.getLectureGrade();
	    	lectureB.getTeacherName();
	    }

	    public void lectureCData() {
	    	lectureC.getLectureGrade();
	    	lectureC.getTeacherName();
	    }
}
