<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
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

<liferay-ui:success key="rayonAdded" message="rayon-added" />
<liferay-ui:success key="rayonUpdated" message="rayon-updated" />
<liferay-ui:success key="rayonDeleted" message="rayon-deleted" />
<liferay-ui:success key="rayonPutArchive" message="rayon-put-archive" />
<liferay-ui:error key="error.add" message="error-added" />
<liferay-ui:error key="error.update" message="error-update" />
<liferay-ui:error key="error.delete" message="error-delete" />
<liferay-ui:error key="error.archive" message="error-archive" />

<h2>REESTR RAYONOV</h2>

    <portlet:renderURL var="editNoteURL">
        <portlet:param name="mvcPath" value="/jsp/edit_note.jsp"></portlet:param>
    </portlet:renderURL>

    <aui:button-row>
        <aui:button onClick="<%= editNoteURL.toString() %>" value="Add Rayon"></aui:button>
    </aui:button-row>

    <liferay-ui:search-container
           total="<%=RayonLocalServiceUtil.getRayons(false).size()%>">
    <liferay-ui:search-container-results
         results="<%= RayonLocalServiceUtil.getRayons(false) %>"/>

        <liferay-ui:search-container-row
            className="com.liferay.reestrRayonov.model.Rayon" modelVar="rayon">

            <liferay-ui:search-container-column-text property="name" name="Rayon name" />

            <liferay-ui:search-container-column-text property="kod" name="Code rayon"/>

            <liferay-ui:search-container-column-jsp
                align="right"
                path="/jsp/note_actions.jsp" />

        </liferay-ui:search-container-row>

        <liferay-ui:search-iterator />

    </liferay-ui:search-container>

