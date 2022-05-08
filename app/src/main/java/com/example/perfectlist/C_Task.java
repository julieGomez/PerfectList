package com.example.perfectlist;

import java.util.Date;

public class C_Task
{
    //Constructor
    public C_Task(String a_name,
                  String a_category,
                  int a_nbPoint,
                  double a_cumulativeTimerInMs,
                  boolean a_isNotificationNeeded,
                  E_Priority a_priority,
                  E_Security a_security,
                  C_Period a_periodicity,
                  Date a_lastAchievement,
                  Date a_endNotification)
    {
        m_name                  = a_name;
        m_category              = a_category;
        m_nbPoint               = a_nbPoint;
        m_cumulativeTimerInMs   = a_cumulativeTimerInMs;
        m_isNotificationNeeded  = a_isNotificationNeeded;
        m_priority              = a_priority;
        m_security              = a_security;
        m_periodicity           = a_periodicity;
        m_lastAchievement       = a_lastAchievement;
        m_endNotification       = a_endNotification;
    }

    //Attributes
    private String      m_name;
    private String      m_category;
    private int         m_nbPoint;
    private double      m_cumulativeTimerInMs;
    private boolean     m_isNotificationNeeded;
    private E_Priority  m_priority;
    private E_Security  m_security;
    private C_Period    m_periodicity;
    private Date        m_lastAchievement;
    private Date        m_endNotification;
}
