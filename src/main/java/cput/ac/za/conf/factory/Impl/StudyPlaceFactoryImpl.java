package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.StudyPlaceFactory;
import cput.ac.za.domain.StudyPlace;

/**
 * Created by student on 2016/04/02.
 */
public class StudyPlaceFactoryImpl implements StudyPlaceFactory
{
    private static StudyPlaceFactoryImpl studyPlaceFactory = null;

    private StudyPlaceFactoryImpl() {
    }
    public static StudyPlaceFactoryImpl getInstance(){
        if(studyPlaceFactory ==null)
            studyPlaceFactory = new StudyPlaceFactoryImpl();
        return studyPlaceFactory;
    }

    @Override
    public StudyPlace createStudyPlace(String studyPlaceName)
    {
        StudyPlace studyPlace = new StudyPlace.Builder().studyPlaceName(studyPlaceName)
                                            .build();
        return studyPlace;
    }
}
