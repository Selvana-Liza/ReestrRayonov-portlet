<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"  %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.portlet.*" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.reestrRayonov.model.Rayon" %>
<%@ page import="com.liferay.reestrRayonov.service.RayonLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />
<liferay-theme:defineObjects />

<%
long rayonId = ParamUtil.getLong(renderRequest, "rayonId");
Rayon rayon = null;
if (rayonId > 0) {
  rayon = RayonLocalServiceUtil.getRayon(rayonId);
}
%>

<h2>EDIT RAYON</h2>

    <portlet:renderURL var="viewURL">
        <portlet:param name="mvcPath" value="/jsp/view.jsp"></portlet:param>
    </portlet:renderURL>

    <portlet:actionURL name="addNote" var="addNoteURL" />

    <aui:form action="<%= addNoteURL %>" name="<portlet:namespace />fm">
    <aui:model-context bean="<%= rayon %>" model="<%= Rayon.class %>" />

    	<aui:fieldset>
    		<aui:input type="text" name="name" id="name" label="Name" >
    		    <aui:validator name="required" errorMessage="name-missing"/>
    		</aui:input>
    		<aui:input type="text" name="kod" id="kod" label="Code rayon" />
    		<aui:input type="checkbox" name="archive" id="archive" label="Status archive" />
    		<aui:input name="rayonId" id="rayonId"  type="hidden" />
    	</aui:fieldset>

    	<aui:button-row>
    		<aui:button type="submit"></aui:button>
    		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    	</aui:button-row>
    </aui:form>

