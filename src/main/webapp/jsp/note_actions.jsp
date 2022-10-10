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

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Rayon rayon = (Rayon)row.getObject();
%>

<liferay-ui:icon-menu>
        <portlet:renderURL var="editURL">
            <portlet:param name="rayonId"
                value="<%= String.valueOf(rayon.getRayonId()) %>" />
            <portlet:param name="mvcPath" value="/jsp/edit_note.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="Edit" url="<%=editURL.toString() %>" />

        <portlet:actionURL name="archiveNote" var="archiveURL">
             <portlet:param name="rayonId"
                 value="<%= String.valueOf(rayon.getRayonId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon image="folder_full_document" message="Put archive" url="<%=archiveURL.toString() %>" />

        <portlet:actionURL name="deleteNote" var="deleteURL">
                <portlet:param name="rayonId"
                    value="<%= String.valueOf(rayon.getRayonId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete message="Delete"  url="<%=deleteURL.toString() %>" />
</liferay-ui:icon-menu>