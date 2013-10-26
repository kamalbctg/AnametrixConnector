
/**
 * CampaignServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.campaign;

        /**
        *  CampaignServiceMessageReceiverInOut message receiver
        */

        public class CampaignServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CampaignServiceSkeleton skel = (CampaignServiceSkeleton)obj;
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
                
                com.eyeblaster.api.message.campaign.GetMarketsResponse getMarketsResponse123 = null;
	                        com.eyeblaster.api.message.campaign.GetMarketsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetMarketsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetMarketsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMarketsResponse123 =
                                                   
                                                   
                                                         skel.GetMarkets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMarketsResponse123, false);
                                    } else 

            if("GetContact".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetContactResponse getContactResponse126 = null;
	                        com.eyeblaster.api.message.campaign.GetContactRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetContactRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetContactRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContactResponse126 =
                                                   
                                                   
                                                         skel.GetContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContactResponse126, false);
                                    } else 

            if("GetMonitorDelivery".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse getMonitorDeliveryResponse129 = null;
	                        com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMonitorDeliveryResponse129 =
                                                   
                                                   
                                                         skel.GetMonitorDelivery(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMonitorDeliveryResponse129, false);
                                    } else 

            if("CreateCampaignCustomLog".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.CreateCampaignCustomLog(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetOffices".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetOfficesResponse getOfficesResponse135 = null;
	                        com.eyeblaster.api.message.campaign.GetOfficesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetOfficesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetOfficesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOfficesResponse135 =
                                                   
                                                   
                                                         skel.GetOffices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOfficesResponse135, false);
                                    } else 

            if("GetAgencyContacts".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetAgencyContactsResponse getAgencyContactsResponse138 = null;
	                        com.eyeblaster.api.message.campaign.GetAgencyContactsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetAgencyContactsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetAgencyContactsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgencyContactsResponse138 =
                                                   
                                                   
                                                         skel.GetAgencyContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgencyContactsResponse138, false);
                                    } else 

            if("DeleteCampaign".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.DeleteCampaignsResponse deleteCampaignsResponse141 = null;
	                        com.eyeblaster.api.message.campaign.DeleteCampaignRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.DeleteCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.DeleteCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteCampaignsResponse141 =
                                                   
                                                   
                                                         skel.DeleteCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteCampaignsResponse141, false);
                                    } else 

            if("PublishCampaign".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.PublishCampaignResponse publishCampaignResponse144 = null;
	                        com.eyeblaster.api.message.campaign.PublishCampaignRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.PublishCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.PublishCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               publishCampaignResponse144 =
                                                   
                                                   
                                                         skel.PublishCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), publishCampaignResponse144, false);
                                    } else 

            if("GetCampaignHistory".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetHistoryResponse getHistoryResponse147 = null;
	                        com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse147 =
                                                   
                                                   
                                                         skel.GetCampaignHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse147, false);
                                    } else 

            if("GetCreativeShops".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetCreativeShopsResponse getCreativeShopsResponse150 = null;
	                        com.eyeblaster.api.message.campaign.GetCreativeShopsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCreativeShopsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCreativeShopsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeShopsResponse150 =
                                                   
                                                   
                                                         skel.GetCreativeShops(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeShopsResponse150, false);
                                    } else 

            if("EnableAutomaticOptimizationOnCampaign".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse enableAutomaticOptimizationResponse153 = null;
	                        com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               enableAutomaticOptimizationResponse153 =
                                                   
                                                   
                                                         skel.EnableAutomaticOptimizationOnCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), enableAutomaticOptimizationResponse153, false);
                                    } else 

            if("GetTargetRegionTree".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetTargetRegionResponse getTargetRegionResponse156 = null;
	                        com.eyeblaster.api.message.campaign.GetTargetRegionRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetTargetRegionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetTargetRegionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTargetRegionResponse156 =
                                                   
                                                   
                                                         skel.GetTargetRegionTree(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTargetRegionResponse156, false);
                                    } else 

            if("CreateContact".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.CreateContactResponse createContactResponse159 = null;
	                        com.eyeblaster.api.message.campaign.CreateContactRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.CreateContactRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.CreateContactRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createContactResponse159 =
                                                   
                                                   
                                                         skel.CreateContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createContactResponse159, false);
                                    } else 

            if("GetSiteContacts".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetSiteContactsResponse getSiteContactsResponse162 = null;
	                        com.eyeblaster.api.message.campaign.GetSiteContactsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetSiteContactsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetSiteContactsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteContactsResponse162 =
                                                   
                                                   
                                                         skel.GetSiteContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteContactsResponse162, false);
                                    } else 

            if("GetCampaignHistoryActions".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetHistoryActionsResponse getHistoryActionsResponse165 = null;
	                        com.eyeblaster.api.message.campaign.GetHistoryActionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse165 =
                                                   
                                                   
                                                         skel.GetCampaignHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse165, false);
                                    } else 

            if("GetCampaignsBasicInfo".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse getCampaignsBasicInfoResponse168 = null;
	                        com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignsBasicInfoResponse168 =
                                                   
                                                   
                                                         skel.GetCampaignsBasicInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignsBasicInfoResponse168, false);
                                    } else 

            if("GetAgencies".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetAgenciesResponse getAgenciesResponse171 = null;
	                        com.eyeblaster.api.message.campaign.GetAgenciesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetAgenciesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetAgenciesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgenciesResponse171 =
                                                   
                                                   
                                                         skel.GetAgencies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgenciesResponse171, false);
                                    } else 

            if("GenerateIOForCampaign".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse generateIOForCampaignResponse174 = null;
	                        com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               generateIOForCampaignResponse174 =
                                                   
                                                   
                                                         skel.GenerateIOForCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), generateIOForCampaignResponse174, false);
                                    } else 

            if("GetCreativeShopContacts".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetCreativeShopResponse getCreativeShopResponse177 = null;
	                        com.eyeblaster.api.message.campaign.GetCreativeShopRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCreativeShopRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCreativeShopRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeShopResponse177 =
                                                   
                                                   
                                                         skel.GetCreativeShopContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeShopResponse177, false);
                                    } else 

            if("UpdateCampaignInteractions".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse updateCampaignInteractionsResponse180 = null;
	                        com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateCampaignInteractionsResponse180 =
                                                   
                                                   
                                                         skel.UpdateCampaignInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateCampaignInteractionsResponse180, false);
                                    } else 

            if("GetCampaignSites".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetCampaignSitesResponse getCampaignSitesResponse183 = null;
	                        com.eyeblaster.api.message.campaign.GetCampaignSitesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCampaignSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCampaignSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignSitesResponse183 =
                                                   
                                                   
                                                         skel.GetCampaignSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignSitesResponse183, false);
                                    } else 

            if("GetAllSiteContacts".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetSiteContactsResponse getSiteContactsResponse186 = null;
	                        com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteContactsResponse186 =
                                                   
                                                   
                                                         skel.GetAllSiteContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteContactsResponse186, false);
                                    } else 

            if("GetAdSnaps".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetAdSnapResponse getAdSnapResponse189 = null;
	                        com.eyeblaster.api.message.campaign.GetAdSnapRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetAdSnapRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetAdSnapRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdSnapResponse189 =
                                                   
                                                   
                                                         skel.GetAdSnaps(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdSnapResponse189, false);
                                    } else 

            if("CreateCampaign".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.CreateCampaignResponse createCampaignResponse192 = null;
	                        com.eyeblaster.api.message.campaign.CreateCampaignRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.CreateCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.CreateCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createCampaignResponse192 =
                                                   
                                                   
                                                         skel.CreateCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createCampaignResponse192, false);
                                    } else 

            if("GetCampaignInteractions".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse getCampaignInteractionsResponse195 = null;
	                        com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignInteractionsResponse195 =
                                                   
                                                   
                                                         skel.GetCampaignInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignInteractionsResponse195, false);
                                    } else 

            if("UpdateCampaign".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.UpdateCampaignResponse updateCampaignResponse198 = null;
	                        com.eyeblaster.api.message.campaign.UpdateCampaignRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.UpdateCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.UpdateCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateCampaignResponse198 =
                                                   
                                                   
                                                         skel.UpdateCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateCampaignResponse198, false);
                                    } else 

            if("GetInteractionRelatedAds".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse getInteractionRelatedAdsResponse201 = null;
	                        com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getInteractionRelatedAdsResponse201 =
                                                   
                                                   
                                                         skel.GetInteractionRelatedAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getInteractionRelatedAdsResponse201, false);
                                    } else 

            if("GetCampaignHistoryObjects".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse getHistoryObjectsResponse204 = null;
	                        com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse204 =
                                                   
                                                   
                                                         skel.GetCampaignHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse204, false);
                                    } else 

            if("GetCampaigns".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetCampaignsResponse getCampaignsResponse207 = null;
	                        com.eyeblaster.api.message.campaign.GetCampaignsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetCampaignsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetCampaignsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignsResponse207 =
                                                   
                                                   
                                                         skel.GetCampaigns(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignsResponse207, false);
                                    } else 

            if("GetSites".equals(methodName)){
                
                com.eyeblaster.api.message.campaign.GetSitesResponse getSitesResponse210 = null;
	                        com.eyeblaster.api.message.campaign.GetSitesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.campaign.GetSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.campaign.GetSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSitesResponse210 =
                                                   
                                                   
                                                         skel.GetSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSitesResponse210, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetMarketsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetMarketsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetMarketsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetMarketsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetContactRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetContactRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetOfficesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetOfficesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetOfficesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetOfficesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetAgencyContactsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetAgencyContactsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetAgencyContactsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetAgencyContactsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.DeleteCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.DeleteCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.DeleteCampaignsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.DeleteCampaignsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.PublishCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.PublishCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.PublishCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.PublishCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCreativeShopsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCreativeShopsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCreativeShopsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCreativeShopsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetTargetRegionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetTargetRegionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetTargetRegionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetTargetRegionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.CreateContactRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.CreateContactRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.CreateContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.CreateContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetSiteContactsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetSiteContactsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetSiteContactsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetSiteContactsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetAgenciesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetAgenciesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetAgenciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetAgenciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCreativeShopRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCreativeShopRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCreativeShopResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCreativeShopResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetAdSnapRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetAdSnapRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetAdSnapResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetAdSnapResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.CreateCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.CreateCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.CreateCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.CreateCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.UpdateCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.UpdateCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.UpdateCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.UpdateCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetCampaignsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.campaign.GetSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.campaign.GetSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetMarketsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetMarketsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetMarketsResponse wrapGetMarkets(){
                                com.eyeblaster.api.message.campaign.GetMarketsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetMarketsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetContactResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetContactResponse wrapGetContact(){
                                com.eyeblaster.api.message.campaign.GetContactResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetContactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse wrapGetMonitorDelivery(){
                                com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetOfficesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetOfficesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetOfficesResponse wrapGetOffices(){
                                com.eyeblaster.api.message.campaign.GetOfficesResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetOfficesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetAgencyContactsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetAgencyContactsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetAgencyContactsResponse wrapGetAgencyContacts(){
                                com.eyeblaster.api.message.campaign.GetAgencyContactsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetAgencyContactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.DeleteCampaignsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.DeleteCampaignsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.DeleteCampaignsResponse wrapDeleteCampaign(){
                                com.eyeblaster.api.message.campaign.DeleteCampaignsResponse wrappedElement = new com.eyeblaster.api.message.campaign.DeleteCampaignsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.PublishCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.PublishCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.PublishCampaignResponse wrapPublishCampaign(){
                                com.eyeblaster.api.message.campaign.PublishCampaignResponse wrappedElement = new com.eyeblaster.api.message.campaign.PublishCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetHistoryResponse wrapGetCampaignHistory(){
                                com.eyeblaster.api.message.campaign.GetHistoryResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetCreativeShopsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetCreativeShopsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetCreativeShopsResponse wrapGetCreativeShops(){
                                com.eyeblaster.api.message.campaign.GetCreativeShopsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetCreativeShopsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse wrapEnableAutomaticOptimizationOnCampaign(){
                                com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse wrappedElement = new com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetTargetRegionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetTargetRegionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetTargetRegionResponse wrapGetTargetRegionTree(){
                                com.eyeblaster.api.message.campaign.GetTargetRegionResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetTargetRegionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.CreateContactResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.CreateContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.CreateContactResponse wrapCreateContact(){
                                com.eyeblaster.api.message.campaign.CreateContactResponse wrappedElement = new com.eyeblaster.api.message.campaign.CreateContactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetSiteContactsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetSiteContactsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetSiteContactsResponse wrapGetSiteContacts(){
                                com.eyeblaster.api.message.campaign.GetSiteContactsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetSiteContactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetHistoryActionsResponse wrapGetCampaignHistoryActions(){
                                com.eyeblaster.api.message.campaign.GetHistoryActionsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse wrapGetCampaignsBasicInfo(){
                                com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetAgenciesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetAgenciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetAgenciesResponse wrapGetAgencies(){
                                com.eyeblaster.api.message.campaign.GetAgenciesResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetAgenciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse wrapGenerateIOForCampaign(){
                                com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse wrappedElement = new com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetCreativeShopResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetCreativeShopResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetCreativeShopResponse wrapGetCreativeShopContacts(){
                                com.eyeblaster.api.message.campaign.GetCreativeShopResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetCreativeShopResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse wrapUpdateCampaignInteractions(){
                                com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse wrappedElement = new com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetCampaignSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetCampaignSitesResponse wrapGetCampaignSites(){
                                com.eyeblaster.api.message.campaign.GetCampaignSitesResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetCampaignSitesResponse();
                                return wrappedElement;
                         }
                    
                         private com.eyeblaster.api.message.campaign.GetSiteContactsResponse wrapGetAllSiteContacts(){
                                com.eyeblaster.api.message.campaign.GetSiteContactsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetSiteContactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetAdSnapResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetAdSnapResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetAdSnapResponse wrapGetAdSnaps(){
                                com.eyeblaster.api.message.campaign.GetAdSnapResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetAdSnapResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.CreateCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.CreateCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.CreateCampaignResponse wrapCreateCampaign(){
                                com.eyeblaster.api.message.campaign.CreateCampaignResponse wrappedElement = new com.eyeblaster.api.message.campaign.CreateCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse wrapGetCampaignInteractions(){
                                com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.UpdateCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.UpdateCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.UpdateCampaignResponse wrapUpdateCampaign(){
                                com.eyeblaster.api.message.campaign.UpdateCampaignResponse wrappedElement = new com.eyeblaster.api.message.campaign.UpdateCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse wrapGetInteractionRelatedAds(){
                                com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse wrapGetCampaignHistoryObjects(){
                                com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetCampaignsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetCampaignsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetCampaignsResponse wrapGetCampaigns(){
                                com.eyeblaster.api.message.campaign.GetCampaignsResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetCampaignsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.campaign.GetSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.campaign.GetSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.campaign.GetSitesResponse wrapGetSites(){
                                com.eyeblaster.api.message.campaign.GetSitesResponse wrappedElement = new com.eyeblaster.api.message.campaign.GetSitesResponse();
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
        
                if (com.eyeblaster.api.message.campaign.GetMarketsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetMarketsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetMarketsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetMarketsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetContactRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetContactRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetContactResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetMonitorDeliveryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetMonitorDeliveryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.CreateCampaignCustomLogRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetOfficesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetOfficesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetOfficesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetOfficesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetAgencyContactsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetAgencyContactsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetAgencyContactsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetAgencyContactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.DeleteCampaignRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.DeleteCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.DeleteCampaignsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.DeleteCampaignsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.PublishCampaignRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.PublishCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.PublishCampaignResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.PublishCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetHistoryResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCreativeShopsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCreativeShopsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCreativeShopsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCreativeShopsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.EnableAutomaticOptimizationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetTargetRegionRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetTargetRegionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetTargetRegionResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetTargetRegionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.CreateContactRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.CreateContactRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.CreateContactResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.CreateContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetSiteContactsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetSiteContactsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetSiteContactsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetSiteContactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetHistoryActionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetHistoryActionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignsBasicInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetAgenciesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetAgenciesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetAgenciesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetAgenciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GenerateIOForCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GenerateIOForCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCreativeShopRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCreativeShopRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCreativeShopResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCreativeShopResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UpdateCampaignInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignSitesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignSitesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignSiteContactsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetSiteContactsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetSiteContactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetAdSnapRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetAdSnapRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetAdSnapResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetAdSnapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.CreateCampaignRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.CreateCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.CreateCampaignResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.CreateCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UpdateCampaignRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UpdateCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UpdateCampaignResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UpdateCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetInteractionRelatedAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetCampaignsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetCampaignsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetSitesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.GetSitesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.GetSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.campaign.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    