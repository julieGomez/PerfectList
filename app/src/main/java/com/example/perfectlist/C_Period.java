package com.example.perfectlist;

public class C_Period
{
    //Constructor
    public C_Period(int a_nbOfRepetitions, E_TimeType a_typeOfRepetitions)
    {
        m_nbOfRepetitions =     a_nbOfRepetitions;
        m_typeOfRepetitions =   a_typeOfRepetitions;
    }

    //Attributes
    private int         m_nbOfRepetitions;
    private E_TimeType  m_typeOfRepetitions;
}
