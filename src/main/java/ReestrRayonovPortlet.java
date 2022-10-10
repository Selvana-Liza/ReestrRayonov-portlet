import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.reestrRayonov.model.Rayon;
import com.liferay.reestrRayonov.service.RayonLocalService;
import com.liferay.reestrRayonov.service.RayonLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.io.IOException;
import java.util.List;

public class ReestrRayonovPortlet extends MVCPortlet {

    public void addNote(ActionRequest request, ActionResponse response) {

        long rayonId = ParamUtil.getLong(request, "rayonId");
        String name = ParamUtil.getString(request, "name");
        int kod = ParamUtil.getInteger(request, "kod");
        boolean archive = ParamUtil.getBoolean(request, "archive");

        Rayon rayon;
        if (rayonId > 0) {
            try {
                rayon = RayonLocalServiceUtil.updateRayon(rayonId, name, kod, archive);
                SessionMessages.add(request, "rayonUpdated");
                response.setRenderParameter("rayonId", Long.toString(rayonId));
            } catch (Exception e) {
                SessionErrors.add(request, "error.update");
                PortalUtil.copyRequestParameters(request, response);
                response.setRenderParameter("mvcPath", "/jsp/edit_note.jsp");
            }
        } else {
            try {
                rayon = RayonLocalServiceUtil.addRayon(name, kod, archive);
                SessionMessages.add(request, "rayonAdded");
                response.setRenderParameter("rayonId", Long.toString(rayonId));
            } catch (Exception e) {
                SessionErrors.add(request, "error.add");
                PortalUtil.copyRequestParameters(request, response);
                response.setRenderParameter("mvcPath", "/jsp/edit_note.jsp");
            }
        }
    }

    public void deleteNote(ActionRequest request, ActionResponse response) {
        long rayonId = ParamUtil.getLong(request, "rayonId");

        try {
            response.setRenderParameter("rayonId", Long.toString(rayonId));
            RayonLocalServiceUtil.deleteRayon(rayonId);
            SessionMessages.add(request, "rayonDeleted");
        } catch (Exception e) {
            SessionErrors.add(request, "error.delete");
        }
    }

    public void archiveNote(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long rayonId = ParamUtil.getLong(request, "rayonId");
        Rayon rayon = RayonLocalServiceUtil.getRayon(rayonId);
        rayon.setArchive(true);

        try {
            response.setRenderParameter("rayonId", Long.toString(rayonId));
            RayonLocalServiceUtil.updateRayon(rayon);
            SessionMessages.add(request, "rayonPutArchive");
        } catch (Exception e) {
            SessionErrors.add(request, "error.archive");
        }
    }

    @Override
    public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        try {
            long rayonId = ParamUtil.getLong(request, "rayonId");
            int countNote = RayonLocalServiceUtil.getRayonsCount();
            List<Rayon> rayons = RayonLocalServiceUtil.getRayons(0, countNote);

            if (rayons.size() == 0) {
                Rayon rayon = RayonLocalServiceUtil.addRayon("Main", 0000000, false);
                rayonId = rayon.getRayonId();
            }
            request.setAttribute("rayonId", rayonId);

        } catch (Exception e) {
            throw new PortletException(e);
        }

        super.render(request, response);
    }

//    @Override
//    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
//        SearchContainer searchContainer =
//                new SearchContainer(renderRequest, renderResponse.createRenderURL(), null,
//                        "there-are-no-fermers");
//
//        List results;
//        int countNote;
//        try {
//            countNote = RayonLocalServiceUtil.getRayonsCount();
//            results = RayonLocalServiceUtil.getRayons(false);
//        } catch (SystemException e) {
//            throw new RuntimeException(e);
//        }
//
//        searchContainer.setTotal(countNote);
//        searchContainer.setResults(results);
//
//        renderRequest.setAttribute("searchContainer", searchContainer);
//        super.doView(renderRequest, renderResponse);
//    }
}
