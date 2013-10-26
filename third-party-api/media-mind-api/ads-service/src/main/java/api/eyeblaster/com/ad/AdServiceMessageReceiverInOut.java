
/**
 * AdServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.ad;

        /**
        *  AdServiceMessageReceiverInOut message receiver
        */

        public class AdServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AdServiceSkeleton skel = (AdServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("GetAdFilters".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse getAdSpecificFiltersResponse215 = null;
	                        com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdSpecificFiltersResponse215 =
                                                   
                                                   
                                                         skel.GetAdFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdSpecificFiltersResponse215, false);
                                    } else 

            if("GetPlacementsOfAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse getPlacementsOfAdResponse218 = null;
	                        com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementsOfAdResponse218 =
                                                   
                                                   
                                                         skel.GetPlacementsOfAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementsOfAdResponse218, false);
                                    } else 

            if("CreateAdClassification".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAdClassificationResponse createAdClassificationResponse221 = null;
	                        com.eyeblaster.api.message.ad.CreateAdClassificationRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAdClassificationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAdClassificationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdClassificationResponse221 =
                                                   
                                                   
                                                         skel.CreateAdClassification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdClassificationResponse221, false);
                                    } else 

            if("GetAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdResponse getAdResponse224 = null;
	                        com.eyeblaster.api.message.ad.GetAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdResponse224 =
                                                   
                                                   
                                                         skel.GetAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdResponse224, false);
                                    } else 

            if("DeleteInStreamVastAssets".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse deleteInStreamVastElementResponse227 = null;
	                        com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteInStreamVastElementResponse227 =
                                                   
                                                   
                                                         skel.DeleteInStreamVastAssets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteInStreamVastElementResponse227, false);
                                    } else 

            if("GetAd3PartyTrackingURLById".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse getAd3RdPartyTrackingURLResponse230 = null;
	                        com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAd3RdPartyTrackingURLResponse230 =
                                                   
                                                   
                                                         skel.GetAd3PartyTrackingURLById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAd3RdPartyTrackingURLResponse230, false);
                                    } else 

            if("UpdateAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdResponse updateAdResponse233 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdResponse233 =
                                                   
                                                   
                                                         skel.UpdateAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdResponse233, false);
                                    } else 

            if("UpdateAdInteractions".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse updateAdInteractionsResponse236 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdInteractionsResponse236 =
                                                   
                                                   
                                                         skel.UpdateAdInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdInteractionsResponse236, false);
                                    } else 

            if("UpdateAdAdditionalAsset".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse updateAdAdditionalAssetResponse239 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdAdditionalAssetResponse239 =
                                                   
                                                   
                                                         skel.UpdateAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdAdditionalAssetResponse239, false);
                                    } else 

            if("GetAdsBasicInfo".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse getAdsBasicInfoResponse242 = null;
	                        com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdsBasicInfoResponse242 =
                                                   
                                                   
                                                         skel.GetAdsBasicInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdsBasicInfoResponse242, false);
                                    } else 

            if("GetAdHistoryObjects".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetHistoryObjectsResponse getHistoryObjectsResponse245 = null;
	                        com.eyeblaster.api.message.ad.GetHistoryObjectsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse245 =
                                                   
                                                   
                                                         skel.GetAdHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse245, false);
                                    } else 

            if("GetPreviewLinks".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetPreviewLinksResponse getPreviewLinksResponse248 = null;
	                        com.eyeblaster.api.message.ad.GetPreviewLinksRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetPreviewLinksRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetPreviewLinksRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPreviewLinksResponse248 =
                                                   
                                                   
                                                         skel.GetPreviewLinks(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPreviewLinksResponse248, false);
                                    } else 

            if("DeleteAdAdditionalAsset".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("UpdateAdPanel".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdPanelResponse updateAdPanelResponse254 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdPanelRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdPanelResponse254 =
                                                   
                                                   
                                                         skel.UpdateAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdPanelResponse254, false);
                                    } else 

            if("DuplicateAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DuplicateAdReponse duplicateAdReponse257 = null;
	                        com.eyeblaster.api.message.ad.DuplicateAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DuplicateAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DuplicateAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               duplicateAdReponse257 =
                                                   
                                                   
                                                         skel.DuplicateAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), duplicateAdReponse257, false);
                                    } else 

            if("DeleteAd3PartyTrackingURLById".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse deleteAd3RdPartyTrackingURLResponse260 = null;
	                        com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAd3RdPartyTrackingURLResponse260 =
                                                   
                                                   
                                                         skel.DeleteAd3PartyTrackingURLById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAd3RdPartyTrackingURLResponse260, false);
                                    } else 

            if("DeleteNotes".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse deleteAdApprovalRemarkResponse263 = null;
	                        com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAdApprovalRemarkResponse263 =
                                                   
                                                   
                                                         skel.DeleteNotes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAdApprovalRemarkResponse263, false);
                                    } else 

            if("RejectAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.RejectAdsResponse rejectAdsResponse266 = null;
	                        com.eyeblaster.api.message.ad.RejectAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.RejectAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.RejectAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               rejectAdsResponse266 =
                                                   
                                                   
                                                         skel.RejectAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), rejectAdsResponse266, false);
                                    } else 

            if("GetAllCategories".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetCategoriesResponse getCategoriesResponse269 = null;
	                        com.eyeblaster.api.message.ad.GetCategoriesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetCategoriesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetCategoriesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCategoriesResponse269 =
                                                   
                                                   
                                                         skel.GetAllCategories(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCategoriesResponse269, false);
                                    } else 

            if("CreateAdAdditionalAsset".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse createAdAdditionalAssetResponse272 = null;
	                        com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdAdditionalAssetResponse272 =
                                                   
                                                   
                                                         skel.CreateAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdAdditionalAssetResponse272, false);
                                    } else 

            if("DeleteInStreamVastCompanionAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse deleteInStreamVastElementResponse275 = null;
	                        com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteInStreamVastElementResponse275 =
                                                   
                                                   
                                                         skel.DeleteInStreamVastCompanionAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteInStreamVastElementResponse275, false);
                                    } else 

            if("GetAdPanels".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdPanelsResponse getAdPanelsResponse278 = null;
	                        com.eyeblaster.api.message.ad.GetAdPanelsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdPanelsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdPanelsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdPanelsResponse278 =
                                                   
                                                   
                                                         skel.GetAdPanels(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdPanelsResponse278, false);
                                    } else 

            if("AttachAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.AttachAdsResponse attachAdsResponse281 = null;
	                        com.eyeblaster.api.message.ad.AttachAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.AttachAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.AttachAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               attachAdsResponse281 =
                                                   
                                                   
                                                         skel.AttachAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), attachAdsResponse281, false);
                                    } else 

            if("GetAgenciesOfAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse getAgenciesOfAdResponse284 = null;
	                        com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgenciesOfAdResponse284 =
                                                   
                                                   
                                                         skel.GetAgenciesOfAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgenciesOfAdResponse284, false);
                                    } else 

            if("UpdateAd3PartyTrackingURL".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse updateAd3RdPartyTrackingURLResponse287 = null;
	                        com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAd3RdPartyTrackingURLResponse287 =
                                                   
                                                   
                                                         skel.UpdateAd3PartyTrackingURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAd3RdPartyTrackingURLResponse287, false);
                                    } else 

            if("DeleteAdPanel".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteAdPanelRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreateAdCustomLog".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAdCustomLogRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAdCustomLogRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAdCustomLogRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.CreateAdCustomLog(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetAdAdditionalAssets".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse getAdAdditionalAssetsResponse296 = null;
	                        com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdAdditionalAssetsResponse296 =
                                                   
                                                   
                                                         skel.GetAdAdditionalAssets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdAdditionalAssetsResponse296, false);
                                    } else 

            if("CreateAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAdResponse createAdResponse299 = null;
	                        com.eyeblaster.api.message.ad.CreateAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdResponse299 =
                                                   
                                                   
                                                         skel.CreateAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdResponse299, false);
                                    } else 

            if("CreateNote".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse createAdApprovalRemarkResponse302 = null;
	                        com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdApprovalRemarkResponse302 =
                                                   
                                                   
                                                         skel.CreateNote(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdApprovalRemarkResponse302, false);
                                    } else 

            if("DeleteAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteAdsResponse deleteAdsResponse305 = null;
	                        com.eyeblaster.api.message.ad.DeleteAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAdsResponse305 =
                                                   
                                                   
                                                         skel.DeleteAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAdsResponse305, false);
                                    } else 

            if("UpdateAdClassification".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdClassificationResponse updateAdClassificationResponse308 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdClassificationRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdClassificationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdClassificationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdClassificationResponse308 =
                                                   
                                                   
                                                         skel.UpdateAdClassification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdClassificationResponse308, false);
                                    } else 

            if("GetAdHistoryActions".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetHistoryActionsResponse getHistoryActionsResponse311 = null;
	                        com.eyeblaster.api.message.ad.GetHistoryActionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse311 =
                                                   
                                                   
                                                         skel.GetAdHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse311, false);
                                    } else 

            if("UpdateAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdsResponse updateAdsResponse314 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdsResponse314 =
                                                   
                                                   
                                                         skel.UpdateAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdsResponse314, false);
                                    } else 

            if("GetAd3PartyTrackingURLsByAdId".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse getAd3RdPartyTrackingURLsResponse317 = null;
	                        com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAd3RdPartyTrackingURLsResponse317 =
                                                   
                                                   
                                                         skel.GetAd3PartyTrackingURLsByAdId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAd3RdPartyTrackingURLsResponse317, false);
                                    } else 

            if("GetAdClassification".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdClassificationResponse getAdClassificationResponse320 = null;
	                        com.eyeblaster.api.message.ad.GetAdClassificationRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdClassificationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdClassificationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdClassificationResponse320 =
                                                   
                                                   
                                                         skel.GetAdClassification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdClassificationResponse320, false);
                                    } else 

            if("GetAdHistory".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetHistoryResponse getHistoryResponse323 = null;
	                        com.eyeblaster.api.message.ad.GetAdHistoryRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse323 =
                                                   
                                                   
                                                         skel.GetAdHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse323, false);
                                    } else 

            if("GetCampaignsOfAd".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse getCampaignsOfAdResponse326 = null;
	                        com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignsOfAdResponse326 =
                                                   
                                                   
                                                         skel.GetCampaignsOfAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignsOfAdResponse326, false);
                                    } else 

            if("GetAdPanel".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdPanelResponse getAdPanelResponse329 = null;
	                        com.eyeblaster.api.message.ad.GetAdPanelRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdPanelResponse329 =
                                                   
                                                   
                                                         skel.GetAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdPanelResponse329, false);
                                    } else 

            if("PublishAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.PublishAdsResponse publishAdsResponse332 = null;
	                        com.eyeblaster.api.message.ad.PublishAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.PublishAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.PublishAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               publishAdsResponse332 =
                                                   
                                                   
                                                         skel.PublishAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), publishAdsResponse332, false);
                                    } else 

            if("GetAds".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdsResponse getAdsResponse335 = null;
	                        com.eyeblaster.api.message.ad.GetAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdsResponse335 =
                                                   
                                                   
                                                         skel.GetAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdsResponse335, false);
                                    } else 

            if("GetAvailableFilters".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdFiltersResponse getAdFiltersResponse338 = null;
	                        com.eyeblaster.api.message.ad.GetAdFiltersRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdFiltersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdFiltersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdFiltersResponse338 =
                                                   
                                                   
                                                         skel.GetAvailableFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdFiltersResponse338, false);
                                    } else 

            if("GetAdInteractions".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdInteractionsResponse getAdInteractionsResponse341 = null;
	                        com.eyeblaster.api.message.ad.GetAdInteractionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdInteractionsResponse341 =
                                                   
                                                   
                                                         skel.GetAdInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdInteractionsResponse341, false);
                                    } else 

            if("GetAdAdditionalAsset".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse getAdAdditionalAssetResponse344 = null;
	                        com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdAdditionalAssetResponse344 =
                                                   
                                                   
                                                         skel.GetAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdAdditionalAssetResponse344, false);
                                    } else 

            if("SetDefaultPanel".equals(methodName)){
                
                com.eyeblaster.api.message.ad.SetDefaultPanelResponse setDefaultPanelResponse347 = null;
	                        com.eyeblaster.api.message.ad.SetDefaultPanelRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.SetDefaultPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.SetDefaultPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setDefaultPanelResponse347 =
                                                   
                                                   
                                                         skel.SetDefaultPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setDefaultPanelResponse347, false);
                                    } else 

            if("GetCategory".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdCategoryResponse getAdCategoryResponse350 = null;
	                        com.eyeblaster.api.message.ad.GetCategoryRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetCategoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetCategoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdCategoryResponse350 =
                                                   
                                                   
                                                         skel.GetCategory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdCategoryResponse350, false);
                                    } else 

            if("SetAdFilters".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse getAdSpecificFiltersResponse353 = null;
	                        com.eyeblaster.api.message.ad.SetAdFiltersRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.SetAdFiltersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.SetAdFiltersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdSpecificFiltersResponse353 =
                                                   
                                                   
                                                         skel.SetAdFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdSpecificFiltersResponse353, false);
                                    } else 

            if("CreateAdPanel".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAdPanelResponse createAdPanelResponse356 = null;
	                        com.eyeblaster.api.message.ad.CreateAdPanelRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdPanelResponse356 =
                                                   
                                                   
                                                         skel.CreateAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdPanelResponse356, false);
                                    } else 

            if("UpdateNote".equals(methodName)){
                
                com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse updateAdApprovalRemarkResponse359 = null;
	                        com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdApprovalRemarkResponse359 =
                                                   
                                                   
                                                         skel.UpdateNote(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdApprovalRemarkResponse359, false);
                                    } else 

            if("CreateAd3PartyTrackingURL".equals(methodName)){
                
                com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse createAd3RdPartyTrackingURLResponse362 = null;
	                        com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAd3RdPartyTrackingURLResponse362 =
                                                   
                                                   
                                                         skel.CreateAd3PartyTrackingURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAd3RdPartyTrackingURLResponse362, false);
                                    } else 

            if("DeleteAd3PartyTrackingURLsByAdId".equals(methodName)){
                
                com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse deleteAd3RdPartyTrackingURLResponse365 = null;
	                        com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAd3RdPartyTrackingURLResponse365 =
                                                   
                                                   
                                                         skel.DeleteAd3PartyTrackingURLsByAdId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAd3RdPartyTrackingURLResponse365, false);
                                    } else 

            if("GetNotes".equals(methodName)){
                
                com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse getAdApprovalRemarksResponse368 = null;
	                        com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest wrappedParam =
                                                             (com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdApprovalRemarksResponse368 =
                                                   
                                                   
                                                         skel.GetNotes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdApprovalRemarksResponse368, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdClassificationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdClassificationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdClassificationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdClassificationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetPreviewLinksRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetPreviewLinksRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetPreviewLinksResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetPreviewLinksResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DuplicateAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DuplicateAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DuplicateAdReponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DuplicateAdReponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.RejectAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.RejectAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.RejectAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.RejectAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetCategoriesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetCategoriesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetCategoriesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetCategoriesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdPanelsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdPanelsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdPanelsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdPanelsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.AttachAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.AttachAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.AttachAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.AttachAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdCustomLogRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdCustomLogRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdClassificationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdClassificationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdClassificationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdClassificationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdClassificationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdClassificationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdClassificationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdClassificationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.PublishAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.PublishAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.PublishAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.PublishAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdFiltersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdFiltersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdFiltersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdFiltersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.SetDefaultPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.SetDefaultPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.SetDefaultPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.SetDefaultPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetCategoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetCategoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdCategoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdCategoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.SetAdFiltersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.SetAdFiltersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAdPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAdPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse wrapGetAdFilters(){
                                com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse wrapGetPlacementsOfAd(){
                                com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse wrappedElement = new com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.CreateAdClassificationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.CreateAdClassificationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.CreateAdClassificationResponse wrapCreateAdClassification(){
                                com.eyeblaster.api.message.ad.CreateAdClassificationResponse wrappedElement = new com.eyeblaster.api.message.ad.CreateAdClassificationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdResponse wrapGetAd(){
                                com.eyeblaster.api.message.ad.GetAdResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse wrapDeleteInStreamVastAssets(){
                                com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse wrappedElement = new com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse wrapGetAd3PartyTrackingURLById(){
                                com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdResponse wrapUpdateAd(){
                                com.eyeblaster.api.message.ad.UpdateAdResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse wrapUpdateAdInteractions(){
                                com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse wrapUpdateAdAdditionalAsset(){
                                com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse wrapGetAdsBasicInfo(){
                                com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetHistoryObjectsResponse wrapGetAdHistoryObjects(){
                                com.eyeblaster.api.message.ad.GetHistoryObjectsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetPreviewLinksResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetPreviewLinksResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetPreviewLinksResponse wrapGetPreviewLinks(){
                                com.eyeblaster.api.message.ad.GetPreviewLinksResponse wrappedElement = new com.eyeblaster.api.message.ad.GetPreviewLinksResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdPanelResponse wrapUpdateAdPanel(){
                                com.eyeblaster.api.message.ad.UpdateAdPanelResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.DuplicateAdReponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.DuplicateAdReponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.DuplicateAdReponse wrapDuplicateAd(){
                                com.eyeblaster.api.message.ad.DuplicateAdReponse wrappedElement = new com.eyeblaster.api.message.ad.DuplicateAdReponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse wrapDeleteAd3PartyTrackingURLById(){
                                com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse wrappedElement = new com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse wrapDeleteNotes(){
                                com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse wrappedElement = new com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.RejectAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.RejectAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.RejectAdsResponse wrapRejectAds(){
                                com.eyeblaster.api.message.ad.RejectAdsResponse wrappedElement = new com.eyeblaster.api.message.ad.RejectAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetCategoriesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetCategoriesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetCategoriesResponse wrapGetAllCategories(){
                                com.eyeblaster.api.message.ad.GetCategoriesResponse wrappedElement = new com.eyeblaster.api.message.ad.GetCategoriesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse wrapCreateAdAdditionalAsset(){
                                com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse wrappedElement = new com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse();
                                return wrappedElement;
                         }
                    
                         private com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse wrapDeleteInStreamVastCompanionAds(){
                                com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse wrappedElement = new com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdPanelsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdPanelsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdPanelsResponse wrapGetAdPanels(){
                                com.eyeblaster.api.message.ad.GetAdPanelsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdPanelsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.AttachAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.AttachAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.AttachAdsResponse wrapAttachAds(){
                                com.eyeblaster.api.message.ad.AttachAdsResponse wrappedElement = new com.eyeblaster.api.message.ad.AttachAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse wrapGetAgenciesOfAd(){
                                com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse wrapUpdateAd3PartyTrackingURL(){
                                com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse wrapGetAdAdditionalAssets(){
                                com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.CreateAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.CreateAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.CreateAdResponse wrapCreateAd(){
                                com.eyeblaster.api.message.ad.CreateAdResponse wrappedElement = new com.eyeblaster.api.message.ad.CreateAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse wrapCreateNote(){
                                com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse wrappedElement = new com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.DeleteAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.DeleteAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.DeleteAdsResponse wrapDeleteAds(){
                                com.eyeblaster.api.message.ad.DeleteAdsResponse wrappedElement = new com.eyeblaster.api.message.ad.DeleteAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdClassificationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdClassificationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdClassificationResponse wrapUpdateAdClassification(){
                                com.eyeblaster.api.message.ad.UpdateAdClassificationResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdClassificationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetHistoryActionsResponse wrapGetAdHistoryActions(){
                                com.eyeblaster.api.message.ad.GetHistoryActionsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdsResponse wrapUpdateAds(){
                                com.eyeblaster.api.message.ad.UpdateAdsResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse wrapGetAd3PartyTrackingURLsByAdId(){
                                com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdClassificationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdClassificationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdClassificationResponse wrapGetAdClassification(){
                                com.eyeblaster.api.message.ad.GetAdClassificationResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdClassificationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetHistoryResponse wrapGetAdHistory(){
                                com.eyeblaster.api.message.ad.GetHistoryResponse wrappedElement = new com.eyeblaster.api.message.ad.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse wrapGetCampaignsOfAd(){
                                com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse wrappedElement = new com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdPanelResponse wrapGetAdPanel(){
                                com.eyeblaster.api.message.ad.GetAdPanelResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.PublishAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.PublishAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.PublishAdsResponse wrapPublishAds(){
                                com.eyeblaster.api.message.ad.PublishAdsResponse wrappedElement = new com.eyeblaster.api.message.ad.PublishAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdsResponse wrapGetAds(){
                                com.eyeblaster.api.message.ad.GetAdsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdFiltersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdFiltersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdFiltersResponse wrapGetAvailableFilters(){
                                com.eyeblaster.api.message.ad.GetAdFiltersResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdInteractionsResponse wrapGetAdInteractions(){
                                com.eyeblaster.api.message.ad.GetAdInteractionsResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse wrapGetAdAdditionalAsset(){
                                com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.SetDefaultPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.SetDefaultPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.SetDefaultPanelResponse wrapSetDefaultPanel(){
                                com.eyeblaster.api.message.ad.SetDefaultPanelResponse wrappedElement = new com.eyeblaster.api.message.ad.SetDefaultPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdCategoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdCategoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdCategoryResponse wrapGetCategory(){
                                com.eyeblaster.api.message.ad.GetAdCategoryResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdCategoryResponse();
                                return wrappedElement;
                         }
                    
                         private com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse wrapSetAdFilters(){
                                com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.CreateAdPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.CreateAdPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.CreateAdPanelResponse wrapCreateAdPanel(){
                                com.eyeblaster.api.message.ad.CreateAdPanelResponse wrappedElement = new com.eyeblaster.api.message.ad.CreateAdPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse wrapUpdateNote(){
                                com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse wrappedElement = new com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse wrapCreateAd3PartyTrackingURL(){
                                com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse wrappedElement = new com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                         private com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse wrapDeleteAd3PartyTrackingURLsByAdId(){
                                com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse wrappedElement = new com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse wrapGetNotes(){
                                com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse wrappedElement = new com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse();
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
        
                if (com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdSpecificFiltersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetPlacementsOfAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetPlacementsOfAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdClassificationRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdClassificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdClassificationResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdClassificationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteInStreamVastAssetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdAdditionalAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdsBasicInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdsBasicInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetHistoryObjectsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetHistoryObjectsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetPreviewLinksRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetPreviewLinksRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetPreviewLinksResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetPreviewLinksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdPanelRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdPanelResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DuplicateAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DuplicateAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DuplicateAdReponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DuplicateAdReponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAdApprovalRemarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.RejectAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.RejectAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.RejectAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.RejectAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetCategoriesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetCategoriesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetCategoriesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetCategoriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdAdditionalAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteInStreamVastCompanionAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteInStreamVastElementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdPanelsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdPanelsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdPanelsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdPanelsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.AttachAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.AttachAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.AttachAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.AttachAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAgenciesOfAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAgenciesOfAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAdPanelRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdCustomLogRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdCustomLogRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdAdditionalAssetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdAdditionalAssetsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdApprovalRemarkRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdApprovalRemarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdClassificationRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdClassificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdClassificationResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdClassificationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetHistoryActionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetHistoryActionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAd3RdPartyTrackingURLsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdClassificationRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdClassificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdClassificationResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdClassificationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdHistoryRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetHistoryResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetCampaignsOfAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetCampaignsOfAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdPanelRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdPanelResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.PublishAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.PublishAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.PublishAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.PublishAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdFiltersRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdFiltersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdFiltersResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdInteractionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdInteractionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdAdditionalAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.SetDefaultPanelRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.SetDefaultPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.SetDefaultPanelResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.SetDefaultPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetCategoryRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetCategoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdCategoryResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdCategoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.SetAdFiltersRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.SetAdFiltersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdSpecificFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdPanelRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAdPanelResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAdPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UpdateAdApprovalRemarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.CreateAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.DeleteAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdApprovalRemarksRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.GetAdApprovalRemarksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.ad.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    