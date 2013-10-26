
/**
 * PlacementServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.placement;

        /**
        *  PlacementServiceMessageReceiverInOut message receiver
        */

        public class PlacementServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        PlacementServiceSkeleton skel = (PlacementServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("GetMarkets".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetMarketsResponse getMarketsResponse202 = null;
	                        com.eyeblaster.api.message.placement.GetMarketsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetMarketsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetMarketsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMarketsResponse202 =
                                                   
                                                   
                                                         skel.GetMarkets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMarketsResponse202, false);
                                    } else 

            if("GetSiteSection".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetSiteSectionResponse getSiteSectionResponse205 = null;
	                        com.eyeblaster.api.message.placement.GetSiteSectionRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetSiteSectionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetSiteSectionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteSectionResponse205 =
                                                   
                                                   
                                                         skel.GetSiteSection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteSectionResponse205, false);
                                    } else 

            if("GetPlacementsBasicInfo".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse getPlacementsBasicInfoResponse208 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementsBasicInfoResponse208 =
                                                   
                                                   
                                                         skel.GetPlacementsBasicInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementsBasicInfoResponse208, false);
                                    } else 

            if("DeletePlacement".equals(methodName)){
                
                com.eyeblaster.api.message.placement.DeletePlacementRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.DeletePlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.DeletePlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeletePlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreatePlacementCustomLog".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.CreatePlacementCustomLog(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("SavePlacementTargeting".equals(methodName)){
                
                com.eyeblaster.api.message.placement.SavePlacementTargetingResponse savePlacementTargetingResponse217 = null;
	                        com.eyeblaster.api.message.placement.SavePlacementTargetingRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.SavePlacementTargetingRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.SavePlacementTargetingRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               savePlacementTargetingResponse217 =
                                                   
                                                   
                                                         skel.SavePlacementTargeting(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), savePlacementTargetingResponse217, false);
                                    } else 

            if("GetPlacementTagSettings".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse getPlacementTagSettingsResponse220 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTagSettingsResponse220 =
                                                   
                                                   
                                                         skel.GetPlacementTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTagSettingsResponse220, false);
                                    } else 

            if("GetOffices".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetOfficesResponse getOfficesResponse223 = null;
	                        com.eyeblaster.api.message.placement.GetOfficesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetOfficesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetOfficesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOfficesResponse223 =
                                                   
                                                   
                                                         skel.GetOffices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOfficesResponse223, false);
                                    } else 

            if("GetBannerSizeByID".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse getBannerSizeByIDResponse226 = null;
	                        com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBannerSizeByIDResponse226 =
                                                   
                                                   
                                                         skel.GetBannerSizeByID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBannerSizeByIDResponse226, false);
                                    } else 

            if("UpdatePlacements".equals(methodName)){
                
                com.eyeblaster.api.message.placement.UpdatePlacementsResponse updatePlacementsResponse229 = null;
	                        com.eyeblaster.api.message.placement.UpdatePlacementsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.UpdatePlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.UpdatePlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updatePlacementsResponse229 =
                                                   
                                                   
                                                         skel.UpdatePlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updatePlacementsResponse229, false);
                                    } else 

            if("GetPlacementTestTagSettings".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse getPlacementTestTagSettingsResponse232 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTestTagSettingsResponse232 =
                                                   
                                                   
                                                         skel.GetPlacementTestTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTestTagSettingsResponse232, false);
                                    } else 

            if("CreatePlacementPackage".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CreatePlacementPackageResponse createPlacementPackageResponse235 = null;
	                        com.eyeblaster.api.message.placement.CreatePlacementPackageRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CreatePlacementPackageRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CreatePlacementPackageRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createPlacementPackageResponse235 =
                                                   
                                                   
                                                         skel.CreatePlacementPackage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createPlacementPackageResponse235, false);
                                    } else 

            if("GetCreativeShops".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetCreativeShopsResponse getCreativeShopsResponse238 = null;
	                        com.eyeblaster.api.message.placement.GetCreativeShopsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetCreativeShopsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetCreativeShopsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeShopsResponse238 =
                                                   
                                                   
                                                         skel.GetCreativeShops(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeShopsResponse238, false);
                                    } else 

            if("GetPlacementHistoryActions".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetHistoryActionsResponse getHistoryActionsResponse241 = null;
	                        com.eyeblaster.api.message.placement.GetHistoryActionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse241 =
                                                   
                                                   
                                                         skel.GetPlacementHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse241, false);
                                    } else 

            if("GetMediaMindMatchingSite".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse getMediaMindMatchingSitesResponse244 = null;
	                        com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMediaMindMatchingSitesResponse244 =
                                                   
                                                   
                                                         skel.GetMediaMindMatchingSite(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMediaMindMatchingSitesResponse244, false);
                                    } else 

            if("GetPlacementPackage".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementPackageResponse getPlacementPackageResponse247 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementPackageRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementPackageRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementPackageRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementPackageResponse247 =
                                                   
                                                   
                                                         skel.GetPlacementPackage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementPackageResponse247, false);
                                    } else 

            if("GetCampaignTagSettings".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse getCampaignTagSettingsResponse250 = null;
	                        com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignTagSettingsResponse250 =
                                                   
                                                   
                                                         skel.GetCampaignTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignTagSettingsResponse250, false);
                                    } else 

            if("CreatePlacement".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CreatePlacementResponse createPlacementResponse253 = null;
	                        com.eyeblaster.api.message.placement.CreatePlacementRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CreatePlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CreatePlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createPlacementResponse253 =
                                                   
                                                   
                                                         skel.CreatePlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createPlacementResponse253, false);
                                    } else 

            if("GetCampaignTags".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetCampaignTagsResponse getCampaignTagsResponse256 = null;
	                        com.eyeblaster.api.message.placement.GetCampaignTagsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetCampaignTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetCampaignTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignTagsResponse256 =
                                                   
                                                   
                                                         skel.GetCampaignTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignTagsResponse256, false);
                                    } else 

            if("GetPlacementPackageByCampaignAndSite".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse getPlacementPackageByCampaignAndSiteResponse259 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementPackageByCampaignAndSiteResponse259 =
                                                   
                                                   
                                                         skel.GetPlacementPackageByCampaignAndSite(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementPackageByCampaignAndSiteResponse259, false);
                                    } else 

            if("SetMediaMindMatchingSection".equals(methodName)){
                
                com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.SetMediaMindMatchingSection(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetBannerSizeByWidthAndHeight".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse getBannerSizeByWidthAndHeightResponse265 = null;
	                        com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBannerSizeByWidthAndHeightResponse265 =
                                                   
                                                   
                                                         skel.GetBannerSizeByWidthAndHeight(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBannerSizeByWidthAndHeightResponse265, false);
                                    } else 

            if("GetPlacementHistoryObjects".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetHistoryObjectsResponse getHistoryObjectsResponse268 = null;
	                        com.eyeblaster.api.message.placement.GetHistoryObjectsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse268 =
                                                   
                                                   
                                                         skel.GetPlacementHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse268, false);
                                    } else 

            if("GetPlacementTargeting".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementTargetingResponse getPlacementTargetingResponse271 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementTargetingRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementTargetingRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementTargetingRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTargetingResponse271 =
                                                   
                                                   
                                                         skel.GetPlacementTargeting(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTargetingResponse271, false);
                                    } else 

            if("UpdatePlacementPackage".equals(methodName)){
                
                com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse updatePlacementPackageResponse274 = null;
	                        com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updatePlacementPackageResponse274 =
                                                   
                                                   
                                                         skel.UpdatePlacementPackage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updatePlacementPackageResponse274, false);
                                    } else 

            if("GetPlacementTestTag".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementTestTagResponse getPlacementTestTagResponse277 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementTestTagRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementTestTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementTestTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTestTagResponse277 =
                                                   
                                                   
                                                         skel.GetPlacementTestTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTestTagResponse277, false);
                                    } else 

            if("GetPlacementTargetingStates".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse getPlacementTargetingStatesResponse280 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTargetingStatesResponse280 =
                                                   
                                                   
                                                         skel.GetPlacementTargetingStates(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTargetingStatesResponse280, false);
                                    } else 

            if("GetMediaMindMatchingSiteSections".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse getMediaMindMatchingSiteSectionsResponse283 = null;
	                        com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMediaMindMatchingSiteSectionsResponse283 =
                                                   
                                                   
                                                         skel.GetMediaMindMatchingSiteSections(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMediaMindMatchingSiteSectionsResponse283, false);
                                    } else 

            if("ResetPlacementTagSettings".equals(methodName)){
                
                com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.ResetPlacementTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetServingSystemList".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetServingSystemListResponse getServingSystemListResponse289 = null;
	                        com.eyeblaster.api.message.placement.GetServingSystemListRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetServingSystemListRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetServingSystemListRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServingSystemListResponse289 =
                                                   
                                                   
                                                         skel.GetServingSystemList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServingSystemListResponse289, false);
                                    } else 

            if("GetMobileSites".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetMobileSitesResponse getMobileSitesResponse292 = null;
	                        com.eyeblaster.api.message.placement.GetMobileSitesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetMobileSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetMobileSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMobileSitesResponse292 =
                                                   
                                                   
                                                         skel.GetMobileSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMobileSitesResponse292, false);
                                    } else 

            if("GetPlacementHistory".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetHistoryResponse getHistoryResponse295 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementHistoryRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse295 =
                                                   
                                                   
                                                         skel.GetPlacementHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse295, false);
                                    } else 

            if("GetAgencies".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetAgenciesResponse getAgenciesResponse298 = null;
	                        com.eyeblaster.api.message.placement.GetAgenciesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetAgenciesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetAgenciesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgenciesResponse298 =
                                                   
                                                   
                                                         skel.GetAgencies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgenciesResponse298, false);
                                    } else 

            if("SetMediaMindMatchingSite".equals(methodName)){
                
                com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.SetMediaMindMatchingSite(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreateSiteSection".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CreateSiteSectionResponse createSiteSectionResponse304 = null;
	                        com.eyeblaster.api.message.placement.CreateSiteSectionRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CreateSiteSectionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CreateSiteSectionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createSiteSectionResponse304 =
                                                   
                                                   
                                                         skel.CreateSiteSection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createSiteSectionResponse304, false);
                                    } else 

            if("DeletePlacements".equals(methodName)){
                
                com.eyeblaster.api.message.placement.DeletePlacementsResponse deletePlacementsResponse307 = null;
	                        com.eyeblaster.api.message.placement.DeletePlacementsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.DeletePlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.DeletePlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deletePlacementsResponse307 =
                                                   
                                                   
                                                         skel.DeletePlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deletePlacementsResponse307, false);
                                    } else 

            if("CreateBannerSize".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CreateBannerSizeResponse createBannerSizeResponse310 = null;
	                        com.eyeblaster.api.message.placement.CreateBannerSizeRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CreateBannerSizeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CreateBannerSizeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createBannerSizeResponse310 =
                                                   
                                                   
                                                         skel.CreateBannerSize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createBannerSizeResponse310, false);
                                    } else 

            if("GetMobileAdServerList".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetMobileAdServerListResponse getMobileAdServerListResponse313 = null;
	                        com.eyeblaster.api.message.placement.GetMobileAdServerListRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetMobileAdServerListRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetMobileAdServerListRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMobileAdServerListResponse313 =
                                                   
                                                   
                                                         skel.GetMobileAdServerList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMobileAdServerListResponse313, false);
                                    } else 

            if("GetBannerSizes".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetBannerSizesResponse getBannerSizesResponse316 = null;
	                        com.eyeblaster.api.message.placement.GetBannerSizesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetBannerSizesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetBannerSizesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBannerSizesResponse316 =
                                                   
                                                   
                                                         skel.GetBannerSizes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBannerSizesResponse316, false);
                                    } else 

            if("GetPlacement".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementResponse getPlacementResponse319 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementResponse319 =
                                                   
                                                   
                                                         skel.GetPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementResponse319, false);
                                    } else 

            if("GetPlacementTag".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementTagResponse getPlacementTagResponse322 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementTagRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTagResponse322 =
                                                   
                                                   
                                                         skel.GetPlacementTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTagResponse322, false);
                                    } else 

            if("UpdatePlacement".equals(methodName)){
                
                com.eyeblaster.api.message.placement.UpdatePlacementResponse updatePlacementResponse325 = null;
	                        com.eyeblaster.api.message.placement.UpdatePlacementRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.UpdatePlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.UpdatePlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updatePlacementResponse325 =
                                                   
                                                   
                                                         skel.UpdatePlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updatePlacementResponse325, false);
                                    } else 

            if("CreatePlacements".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CreatePlacementsResponse createPlacementsResponse328 = null;
	                        com.eyeblaster.api.message.placement.CreatePlacementsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CreatePlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CreatePlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createPlacementsResponse328 =
                                                   
                                                   
                                                         skel.CreatePlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createPlacementsResponse328, false);
                                    } else 

            if("GetSiteSections".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetSiteSectionsResponse getSiteSectionsResponse331 = null;
	                        com.eyeblaster.api.message.placement.GetSiteSectionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetSiteSectionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetSiteSectionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteSectionsResponse331 =
                                                   
                                                   
                                                         skel.GetSiteSections(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteSectionsResponse331, false);
                                    } else 

            if("CopyPlacements".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CopyPlacementsResponse copyPlacementsResponse334 = null;
	                        com.eyeblaster.api.message.placement.CopyPlacementsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CopyPlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CopyPlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyPlacementsResponse334 =
                                                   
                                                   
                                                         skel.CopyPlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyPlacementsResponse334, false);
                                    } else 

            if("PreviewPlacement".equals(methodName)){
                
                com.eyeblaster.api.message.placement.PreviewPlacementResponse previewPlacementResponse337 = null;
	                        com.eyeblaster.api.message.placement.PreviewPlacementRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.PreviewPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.PreviewPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               previewPlacementResponse337 =
                                                   
                                                   
                                                         skel.PreviewPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), previewPlacementResponse337, false);
                                    } else 

            if("CopyPlacement".equals(methodName)){
                
                com.eyeblaster.api.message.placement.CopyPlacementResponse copyPlacementResponse340 = null;
	                        com.eyeblaster.api.message.placement.CopyPlacementRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.CopyPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.CopyPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyPlacementResponse340 =
                                                   
                                                   
                                                         skel.CopyPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyPlacementResponse340, false);
                                    } else 

            if("GetSites".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetSitesResponse getSitesResponse343 = null;
	                        com.eyeblaster.api.message.placement.GetSitesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSitesResponse343 =
                                                   
                                                   
                                                         skel.GetSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSitesResponse343, false);
                                    } else 

            if("GetPlacements".equals(methodName)){
                
                com.eyeblaster.api.message.placement.GetPlacementsResponse getPlacementsResponse346 = null;
	                        com.eyeblaster.api.message.placement.GetPlacementsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.placement.GetPlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.placement.GetPlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementsResponse346 =
                                                   
                                                   
                                                         skel.GetPlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementsResponse346, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMarketsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMarketsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMarketsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMarketsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetSiteSectionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetSiteSectionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetSiteSectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetSiteSectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.DeletePlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.DeletePlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.SavePlacementTargetingRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.SavePlacementTargetingRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.SavePlacementTargetingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.SavePlacementTargetingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetOfficesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetOfficesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetOfficesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetOfficesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UpdatePlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UpdatePlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementPackageRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementPackageRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementPackageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementPackageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetCreativeShopsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetCreativeShopsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetCreativeShopsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetCreativeShopsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementPackageRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementPackageRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementPackageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementPackageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetCampaignTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetCampaignTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetCampaignTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetCampaignTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTargetingRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTargetingRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTargetingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTargetingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTestTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTestTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTestTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTestTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetServingSystemListRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetServingSystemListRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetServingSystemListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetServingSystemListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMobileSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMobileSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMobileSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMobileSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetAgenciesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetAgenciesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetAgenciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetAgenciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreateSiteSectionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreateSiteSectionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreateSiteSectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreateSiteSectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.DeletePlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.DeletePlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.DeletePlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.DeletePlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreateBannerSizeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreateBannerSizeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreateBannerSizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreateBannerSizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMobileAdServerListRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMobileAdServerListRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetMobileAdServerListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetMobileAdServerListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetBannerSizesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetBannerSizesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UpdatePlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.UpdatePlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CreatePlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetSiteSectionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetSiteSectionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetSiteSectionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetSiteSectionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CopyPlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CopyPlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CopyPlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CopyPlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.PreviewPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.PreviewPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.PreviewPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.PreviewPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CopyPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CopyPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.CopyPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.CopyPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.placement.GetPlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetMarketsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetMarketsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetMarketsResponse wrapGetMarkets(){
                                com.eyeblaster.api.message.placement.GetMarketsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetMarketsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetSiteSectionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetSiteSectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetSiteSectionResponse wrapGetSiteSection(){
                                com.eyeblaster.api.message.placement.GetSiteSectionResponse wrappedElement = new com.eyeblaster.api.message.placement.GetSiteSectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse wrapGetPlacementsBasicInfo(){
                                com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.SavePlacementTargetingResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.SavePlacementTargetingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.SavePlacementTargetingResponse wrapSavePlacementTargeting(){
                                com.eyeblaster.api.message.placement.SavePlacementTargetingResponse wrappedElement = new com.eyeblaster.api.message.placement.SavePlacementTargetingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse wrapGetPlacementTagSettings(){
                                com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetOfficesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetOfficesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetOfficesResponse wrapGetOffices(){
                                com.eyeblaster.api.message.placement.GetOfficesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetOfficesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse wrapGetBannerSizeByID(){
                                com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse wrappedElement = new com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.UpdatePlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.UpdatePlacementsResponse wrapUpdatePlacements(){
                                com.eyeblaster.api.message.placement.UpdatePlacementsResponse wrappedElement = new com.eyeblaster.api.message.placement.UpdatePlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse wrapGetPlacementTestTagSettings(){
                                com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CreatePlacementPackageResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementPackageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CreatePlacementPackageResponse wrapCreatePlacementPackage(){
                                com.eyeblaster.api.message.placement.CreatePlacementPackageResponse wrappedElement = new com.eyeblaster.api.message.placement.CreatePlacementPackageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetCreativeShopsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetCreativeShopsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetCreativeShopsResponse wrapGetCreativeShops(){
                                com.eyeblaster.api.message.placement.GetCreativeShopsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetCreativeShopsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetHistoryActionsResponse wrapGetPlacementHistoryActions(){
                                com.eyeblaster.api.message.placement.GetHistoryActionsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse wrapGetMediaMindMatchingSite(){
                                com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementPackageResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementPackageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementPackageResponse wrapGetPlacementPackage(){
                                com.eyeblaster.api.message.placement.GetPlacementPackageResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementPackageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse wrapGetCampaignTagSettings(){
                                com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CreatePlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CreatePlacementResponse wrapCreatePlacement(){
                                com.eyeblaster.api.message.placement.CreatePlacementResponse wrappedElement = new com.eyeblaster.api.message.placement.CreatePlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetCampaignTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetCampaignTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetCampaignTagsResponse wrapGetCampaignTags(){
                                com.eyeblaster.api.message.placement.GetCampaignTagsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetCampaignTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse wrapGetPlacementPackageByCampaignAndSite(){
                                com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse wrapGetBannerSizeByWidthAndHeight(){
                                com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse wrappedElement = new com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetHistoryObjectsResponse wrapGetPlacementHistoryObjects(){
                                com.eyeblaster.api.message.placement.GetHistoryObjectsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementTargetingResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTargetingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementTargetingResponse wrapGetPlacementTargeting(){
                                com.eyeblaster.api.message.placement.GetPlacementTargetingResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementTargetingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse wrapUpdatePlacementPackage(){
                                com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse wrappedElement = new com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementTestTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTestTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementTestTagResponse wrapGetPlacementTestTag(){
                                com.eyeblaster.api.message.placement.GetPlacementTestTagResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementTestTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse wrapGetPlacementTargetingStates(){
                                com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse wrapGetMediaMindMatchingSiteSections(){
                                com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetServingSystemListResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetServingSystemListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetServingSystemListResponse wrapGetServingSystemList(){
                                com.eyeblaster.api.message.placement.GetServingSystemListResponse wrappedElement = new com.eyeblaster.api.message.placement.GetServingSystemListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetMobileSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetMobileSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetMobileSitesResponse wrapGetMobileSites(){
                                com.eyeblaster.api.message.placement.GetMobileSitesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetMobileSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetHistoryResponse wrapGetPlacementHistory(){
                                com.eyeblaster.api.message.placement.GetHistoryResponse wrappedElement = new com.eyeblaster.api.message.placement.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetAgenciesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetAgenciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetAgenciesResponse wrapGetAgencies(){
                                com.eyeblaster.api.message.placement.GetAgenciesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetAgenciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CreateSiteSectionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CreateSiteSectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CreateSiteSectionResponse wrapCreateSiteSection(){
                                com.eyeblaster.api.message.placement.CreateSiteSectionResponse wrappedElement = new com.eyeblaster.api.message.placement.CreateSiteSectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.DeletePlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.DeletePlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.DeletePlacementsResponse wrapDeletePlacements(){
                                com.eyeblaster.api.message.placement.DeletePlacementsResponse wrappedElement = new com.eyeblaster.api.message.placement.DeletePlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CreateBannerSizeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CreateBannerSizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CreateBannerSizeResponse wrapCreateBannerSize(){
                                com.eyeblaster.api.message.placement.CreateBannerSizeResponse wrappedElement = new com.eyeblaster.api.message.placement.CreateBannerSizeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetMobileAdServerListResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetMobileAdServerListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetMobileAdServerListResponse wrapGetMobileAdServerList(){
                                com.eyeblaster.api.message.placement.GetMobileAdServerListResponse wrappedElement = new com.eyeblaster.api.message.placement.GetMobileAdServerListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetBannerSizesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetBannerSizesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetBannerSizesResponse wrapGetBannerSizes(){
                                com.eyeblaster.api.message.placement.GetBannerSizesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetBannerSizesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementResponse wrapGetPlacement(){
                                com.eyeblaster.api.message.placement.GetPlacementResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementTagResponse wrapGetPlacementTag(){
                                com.eyeblaster.api.message.placement.GetPlacementTagResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.UpdatePlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.UpdatePlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.UpdatePlacementResponse wrapUpdatePlacement(){
                                com.eyeblaster.api.message.placement.UpdatePlacementResponse wrappedElement = new com.eyeblaster.api.message.placement.UpdatePlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CreatePlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CreatePlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CreatePlacementsResponse wrapCreatePlacements(){
                                com.eyeblaster.api.message.placement.CreatePlacementsResponse wrappedElement = new com.eyeblaster.api.message.placement.CreatePlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetSiteSectionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetSiteSectionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetSiteSectionsResponse wrapGetSiteSections(){
                                com.eyeblaster.api.message.placement.GetSiteSectionsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetSiteSectionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CopyPlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CopyPlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CopyPlacementsResponse wrapCopyPlacements(){
                                com.eyeblaster.api.message.placement.CopyPlacementsResponse wrappedElement = new com.eyeblaster.api.message.placement.CopyPlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.PreviewPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.PreviewPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.PreviewPlacementResponse wrapPreviewPlacement(){
                                com.eyeblaster.api.message.placement.PreviewPlacementResponse wrappedElement = new com.eyeblaster.api.message.placement.PreviewPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.CopyPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.CopyPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.CopyPlacementResponse wrapCopyPlacement(){
                                com.eyeblaster.api.message.placement.CopyPlacementResponse wrappedElement = new com.eyeblaster.api.message.placement.CopyPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetSitesResponse wrapGetSites(){
                                com.eyeblaster.api.message.placement.GetSitesResponse wrappedElement = new com.eyeblaster.api.message.placement.GetSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.placement.GetPlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.placement.GetPlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.placement.GetPlacementsResponse wrapGetPlacements(){
                                com.eyeblaster.api.message.placement.GetPlacementsResponse wrappedElement = new com.eyeblaster.api.message.placement.GetPlacementsResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.eyeblaster.api.message.placement.GetMarketsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMarketsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMarketsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMarketsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetSiteSectionRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetSiteSectionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetSiteSectionResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetSiteSectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementsBasicInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementsBasicInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.DeletePlacementRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.DeletePlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementCustomLogRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.SavePlacementTargetingRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.SavePlacementTargetingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.SavePlacementTargetingResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.SavePlacementTargetingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTagSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetOfficesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetOfficesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetOfficesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetOfficesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetBannerSizeByIDRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetBannerSizeByIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UpdatePlacementsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UpdatePlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UpdatePlacementsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UpdatePlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTestTagSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementPackageRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementPackageResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetCreativeShopsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetCreativeShopsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetCreativeShopsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetCreativeShopsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetHistoryActionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetHistoryActionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMediaMindMatchingSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementPackageRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementPackageResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetCampaignTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetCampaignTagSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetCampaignTagsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetCampaignTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetCampaignTagsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetCampaignTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementPackageByCampaignAndSiteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteSectionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetBannerSizeByWidthAndHeightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetHistoryObjectsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetHistoryObjectsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTargetingRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTargetingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTargetingResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTargetingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UpdatePlacementPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UpdatePlacementPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTestTagRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTestTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTestTagResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTestTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTargetingStatesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTargetingStatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMediaMindMatchingSiteSectionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.ResetPlacementTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetServingSystemListRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetServingSystemListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetServingSystemListResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetServingSystemListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMobileSitesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMobileSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMobileSitesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMobileSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementHistoryRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetHistoryResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetAgenciesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetAgenciesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetAgenciesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetAgenciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.SetMediaMindMatchingSiteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreateSiteSectionRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreateSiteSectionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreateSiteSectionResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreateSiteSectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.DeletePlacementsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.DeletePlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.DeletePlacementsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.DeletePlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreateBannerSizeRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreateBannerSizeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreateBannerSizeResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreateBannerSizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMobileAdServerListRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMobileAdServerListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetMobileAdServerListResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetMobileAdServerListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetBannerSizesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetBannerSizesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetBannerSizesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetBannerSizesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTagRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementTagResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UpdatePlacementRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UpdatePlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UpdatePlacementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UpdatePlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CreatePlacementsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CreatePlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetSiteSectionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetSiteSectionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetSiteSectionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetSiteSectionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CopyPlacementsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CopyPlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CopyPlacementsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CopyPlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.PreviewPlacementRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.PreviewPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.PreviewPlacementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.PreviewPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CopyPlacementRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CopyPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.CopyPlacementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.CopyPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetSitesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetSitesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.GetPlacementsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.GetPlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.placement.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    