
/**
 * AdvertiserServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.advertiser;

        /**
        *  AdvertiserServiceMessageReceiverInOut message receiver
        */

        public class AdvertiserServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AdvertiserServiceSkeleton skel = (AdvertiserServiceSkeleton)obj;
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
                
                com.eyeblaster.api.message.advertiser.GetMarketsResponse getMarketsResponse107 = null;
	                        com.eyeblaster.api.message.advertiser.GetMarketsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetMarketsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetMarketsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMarketsResponse107 =
                                                   
                                                   
                                                         skel.GetMarkets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMarketsResponse107, false);
                                    } else 

            if("UpdateConversionTagType".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse updateConversionTagTypeResponse110 = null;
	                        com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateConversionTagTypeResponse110 =
                                                   
                                                   
                                                         skel.UpdateConversionTagType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateConversionTagTypeResponse110, false);
                                    } else 

            if("DeleteBrand".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.DeleteBrandRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.DeleteBrandRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.DeleteBrandRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteBrand(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreateConversionTags".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse createConversionTagsResponse116 = null;
	                        com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createConversionTagsResponse116 =
                                                   
                                                   
                                                         skel.CreateConversionTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createConversionTagsResponse116, false);
                                    } else 

            if("CreateBrand".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.CreateBrandResponse createBrandResponse119 = null;
	                        com.eyeblaster.api.message.advertiser.CreateBrandRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.CreateBrandRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.CreateBrandRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createBrandResponse119 =
                                                   
                                                   
                                                         skel.CreateBrand(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createBrandResponse119, false);
                                    } else 

            if("GetConversionTagsThirdParty".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse getConversionTagsThirdPartyResponse122 = null;
	                        com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getConversionTagsThirdPartyResponse122 =
                                                   
                                                   
                                                         skel.GetConversionTagsThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getConversionTagsThirdPartyResponse122, false);
                                    } else 

            if("DeleteAdvertiser".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse deleteAdvertiserResponse125 = null;
	                        com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAdvertiserResponse125 =
                                                   
                                                   
                                                         skel.DeleteAdvertiser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAdvertiserResponse125, false);
                                    } else 

            if("UpdateBrand".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.UpdateBrandResponse updateBrandResponse128 = null;
	                        com.eyeblaster.api.message.advertiser.UpdateBrandRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.UpdateBrandRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.UpdateBrandRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateBrandResponse128 =
                                                   
                                                   
                                                         skel.UpdateBrand(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateBrandResponse128, false);
                                    } else 

            if("GetOffices".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetOfficesResponse getOfficesResponse131 = null;
	                        com.eyeblaster.api.message.advertiser.GetOfficesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetOfficesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetOfficesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOfficesResponse131 =
                                                   
                                                   
                                                         skel.GetOffices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOfficesResponse131, false);
                                    } else 

            if("GetAdvertiserHistoryActions".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse getHistoryActionsResponse134 = null;
	                        com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse134 =
                                                   
                                                   
                                                         skel.GetAdvertiserHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse134, false);
                                    } else 

            if("CreateConversionTag".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.CreateConversionTagResponse createConversionTagResponse137 = null;
	                        com.eyeblaster.api.message.advertiser.CreateConversionTagRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.CreateConversionTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.CreateConversionTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createConversionTagResponse137 =
                                                   
                                                   
                                                         skel.CreateConversionTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createConversionTagResponse137, false);
                                    } else 

            if("UpdateAdvertiser".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse updateAdvertiserResponse140 = null;
	                        com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdvertiserResponse140 =
                                                   
                                                   
                                                         skel.UpdateAdvertiser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdvertiserResponse140, false);
                                    } else 

            if("DeleteConversionTagThirdParty".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteConversionTagThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetAdvertiserHistoryObjects".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse getHistoryObjectsResponse146 = null;
	                        com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse146 =
                                                   
                                                   
                                                         skel.GetAdvertiserHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse146, false);
                                    } else 

            if("GetCurrencies".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetCurrenciesResponse getCurrenciesResponse149 = null;
	                        com.eyeblaster.api.message.advertiser.GetCurrenciesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetCurrenciesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetCurrenciesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCurrenciesResponse149 =
                                                   
                                                   
                                                         skel.GetCurrencies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCurrenciesResponse149, false);
                                    } else 

            if("CreateAdvertiser".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse createAdvertiserResponse152 = null;
	                        com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdvertiserResponse152 =
                                                   
                                                   
                                                         skel.CreateAdvertiser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdvertiserResponse152, false);
                                    } else 

            if("GetBrands".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetBrandsResponse getBrandsResponse155 = null;
	                        com.eyeblaster.api.message.advertiser.GetBrandsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetBrandsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetBrandsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBrandsResponse155 =
                                                   
                                                   
                                                         skel.GetBrands(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBrandsResponse155, false);
                                    } else 

            if("DeleteConversionTags".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse deleteConversionTagsResponse158 = null;
	                        com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteConversionTagsResponse158 =
                                                   
                                                   
                                                         skel.DeleteConversionTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteConversionTagsResponse158, false);
                                    } else 

            if("UpdateConversionTag".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse updateConversionTagResponse161 = null;
	                        com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateConversionTagResponse161 =
                                                   
                                                   
                                                         skel.UpdateConversionTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateConversionTagResponse161, false);
                                    } else 

            if("GetConversionTagCode".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse conversionTagCodeResponse164 = null;
	                        com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               conversionTagCodeResponse164 =
                                                   
                                                   
                                                         skel.GetConversionTagCode(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), conversionTagCodeResponse164, false);
                                    } else 

            if("CreateConversionTagThirdParty".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse createConversionTagThirdPartyResponse167 = null;
	                        com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createConversionTagThirdPartyResponse167 =
                                                   
                                                   
                                                         skel.CreateConversionTagThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createConversionTagThirdPartyResponse167, false);
                                    } else 

            if("GetConversionTags".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetConversionTagsResponse getConversionTagsResponse170 = null;
	                        com.eyeblaster.api.message.advertiser.GetConversionTagsRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetConversionTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetConversionTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getConversionTagsResponse170 =
                                                   
                                                   
                                                         skel.GetConversionTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getConversionTagsResponse170, false);
                                    } else 

            if("GetAdvertisers".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetAdvertisersResponse getAdvertisersResponse173 = null;
	                        com.eyeblaster.api.message.advertiser.GetAdvertisersRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetAdvertisersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetAdvertisersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdvertisersResponse173 =
                                                   
                                                   
                                                         skel.GetAdvertisers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdvertisersResponse173, false);
                                    } else 

            if("GetAdvertiserHistory".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetHistoryResponse getHistoryResponse176 = null;
	                        com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse176 =
                                                   
                                                   
                                                         skel.GetAdvertiserHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse176, false);
                                    } else 

            if("UpdateConversionTagThirdParty".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse updateConversionTagThirdPartyResponse179 = null;
	                        com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateConversionTagThirdPartyResponse179 =
                                                   
                                                   
                                                         skel.UpdateConversionTagThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateConversionTagThirdPartyResponse179, false);
                                    } else 

            if("GetSites".equals(methodName)){
                
                com.eyeblaster.api.message.advertiser.GetSitesResponse getSitesResponse182 = null;
	                        com.eyeblaster.api.message.advertiser.GetSitesRequest wrappedParam =
                                                             (com.eyeblaster.api.message.advertiser.GetSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.advertiser.GetSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSitesResponse182 =
                                                   
                                                   
                                                         skel.GetSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSitesResponse182, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetMarketsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetMarketsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetMarketsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetMarketsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.DeleteBrandRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteBrandRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateBrandRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateBrandRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateBrandResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateBrandResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateBrandRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateBrandRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateBrandResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateBrandResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetOfficesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetOfficesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetOfficesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetOfficesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateConversionTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateConversionTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetCurrenciesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetCurrenciesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetCurrenciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetCurrenciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetBrandsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetBrandsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetBrandsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetBrandsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetConversionTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetConversionTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetAdvertisersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetAdvertisersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetAdvertisersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetAdvertisersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.advertiser.GetSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.advertiser.GetSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetMarketsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetMarketsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetMarketsResponse wrapGetMarkets(){
                                com.eyeblaster.api.message.advertiser.GetMarketsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetMarketsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse wrapUpdateConversionTagType(){
                                com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse wrappedElement = new com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse wrapCreateConversionTags(){
                                com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateBrandResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateBrandResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.CreateBrandResponse wrapCreateBrand(){
                                com.eyeblaster.api.message.advertiser.CreateBrandResponse wrappedElement = new com.eyeblaster.api.message.advertiser.CreateBrandResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse wrapGetConversionTagsThirdParty(){
                                com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse wrapDeleteAdvertiser(){
                                com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse wrappedElement = new com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateBrandResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateBrandResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.UpdateBrandResponse wrapUpdateBrand(){
                                com.eyeblaster.api.message.advertiser.UpdateBrandResponse wrappedElement = new com.eyeblaster.api.message.advertiser.UpdateBrandResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetOfficesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetOfficesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetOfficesResponse wrapGetOffices(){
                                com.eyeblaster.api.message.advertiser.GetOfficesResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetOfficesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse wrapGetAdvertiserHistoryActions(){
                                com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateConversionTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.CreateConversionTagResponse wrapCreateConversionTag(){
                                com.eyeblaster.api.message.advertiser.CreateConversionTagResponse wrappedElement = new com.eyeblaster.api.message.advertiser.CreateConversionTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse wrapUpdateAdvertiser(){
                                com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse wrappedElement = new com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse wrapGetAdvertiserHistoryObjects(){
                                com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetCurrenciesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetCurrenciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetCurrenciesResponse wrapGetCurrencies(){
                                com.eyeblaster.api.message.advertiser.GetCurrenciesResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetCurrenciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse wrapCreateAdvertiser(){
                                com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse wrappedElement = new com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetBrandsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetBrandsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetBrandsResponse wrapGetBrands(){
                                com.eyeblaster.api.message.advertiser.GetBrandsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetBrandsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse wrapDeleteConversionTags(){
                                com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse wrapUpdateConversionTag(){
                                com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse wrappedElement = new com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse wrapGetConversionTagCode(){
                                com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse wrappedElement = new com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse wrapCreateConversionTagThirdParty(){
                                com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse wrappedElement = new com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetConversionTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetConversionTagsResponse wrapGetConversionTags(){
                                com.eyeblaster.api.message.advertiser.GetConversionTagsResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetConversionTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetAdvertisersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetAdvertisersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetAdvertisersResponse wrapGetAdvertisers(){
                                com.eyeblaster.api.message.advertiser.GetAdvertisersResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetAdvertisersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetHistoryResponse wrapGetAdvertiserHistory(){
                                com.eyeblaster.api.message.advertiser.GetHistoryResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse wrapUpdateConversionTagThirdParty(){
                                com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse wrappedElement = new com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.advertiser.GetSitesResponse wrapGetSites(){
                                com.eyeblaster.api.message.advertiser.GetSitesResponse wrappedElement = new com.eyeblaster.api.message.advertiser.GetSitesResponse();
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
        
                if (com.eyeblaster.api.message.advertiser.GetMarketsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetMarketsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetMarketsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetMarketsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.DeleteBrandRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.DeleteBrandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateBrandRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateBrandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateBrandResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateBrandResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateBrandRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateBrandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateBrandResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateBrandResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetOfficesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetOfficesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetOfficesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetOfficesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateConversionTagRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateConversionTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateConversionTagResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateConversionTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetCurrenciesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetCurrenciesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetCurrenciesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetCurrenciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetBrandsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetBrandsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetBrandsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetBrandsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetConversionTagsRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetConversionTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetConversionTagsResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetConversionTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetAdvertisersRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetAdvertisersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetAdvertisersResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetAdvertisersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetHistoryResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetSitesRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.GetSitesResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.GetSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.advertiser.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    