<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Session Info</TITLE>
<LINK REL=STYLESHEET
     HREF="events-styles.css"
     TYPE="text/css">
</HEAD>

<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
  <TR><TH CLASS="TITLE">Session Info</TABLE>
<P>

    <jsp:useBean class="com.compny.SessionCounter"
          id="sessionCounter" scope="application" />
  
   
<UL>
<LI>Total number of sessions in the life of this
   Web application:
   <jsp:getProperty name="sessionCounter"
               property="totalSessionCount" />.
<LI>Number of sessions currently in memory:
  <jsp:getProperty name="sessionCounter"
              property="currentSessionCount" />.

</UL>
</BODY>
</HTML>