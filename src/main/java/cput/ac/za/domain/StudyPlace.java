package cput.ac.za.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/01.
 */
public class StudyPlace implements Serializable
{
    private String studyPlaceName;

    private StudyPlace(){}

    public StudyPlace(Builder builder)
    {
        studyPlaceName = builder.studyPlaceName;
    }

    public String getStudyPlaceName() {
        return studyPlaceName;
    }

    public static class Builder
    {
        private String studyPlaceName;

        public Builder studyPlaceName(String value)
        {
            this.studyPlaceName = value;
            return this;
        }

        public Builder copy(StudyPlace value)
        {
            this.studyPlaceName = value.getStudyPlaceName();
            return this;
        }
        public StudyPlace build(){return new StudyPlace(this);}
    }
}
