package cput.ac.za.conf.factory;

import cput.ac.za.domain.StudyPlace;

/**
 * Created by student on 2016/04/02.
 */
public interface StudyPlaceFactory
{
    public StudyPlace createStudyPlace(String studyPlaceName);
}
