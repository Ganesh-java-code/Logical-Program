package in.ganesh.test.immutable1;

import java.util.Objects;

public class FakeStudentMutable extends Student{

    private String fakeStudentName;

    public FakeStudentMutable(String name) {
        super(name);
        this.setFakeStudentName(name);
    }

    public String getFakeStudentName() {
        return fakeStudentName;
    }

    public void setFakeStudentName(String fakeStudentName) {
        this.fakeStudentName = fakeStudentName;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals(o) ) return false;
        FakeStudentMutable that = (FakeStudentMutable) o;
        return Objects.equals(fakeStudentName, that.fakeStudentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fakeStudentName);
    }

    @Override
    public String toString() {
        return "FakeStudentMutable{" +
                "fakeStudentName='" + fakeStudentName + '\'' +
                '}';
    }
}
