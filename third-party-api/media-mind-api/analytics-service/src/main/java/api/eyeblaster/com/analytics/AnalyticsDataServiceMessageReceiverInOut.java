
/**
 * AnalyticsDataServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.analytics;

        /**
        *  AnalyticsDataServiceMessageReceiverInOut message receiver
        */

        public class AnalyticsDataServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AnalyticsDataServiceSkeleton skel = (AnalyticsDataServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("GetReportsLastAggregationTime".equals(methodName)){
                
                com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse getReportsLastAggregationTimeResponse22 = null;
	                        com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest wrappedParam =
                                                             (com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getReportsLastAggregationTimeResponse22 =
                                                   
                                                   
                                                         skel.GetReportsLastAggregationTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getReportsLastAggregationTimeResponse22, false);
                                    } else 

            if("InitiateReportJob".equals(methodName)){
                
                com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse initiateAnalyticsReportJobResponse25 = null;
	                        com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest wrappedParam =
                                                             (com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               initiateAnalyticsReportJobResponse25 =
                                                   
                                                   
                                                         skel.InitiateReportJob(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), initiateAnalyticsReportJobResponse25, false);
                                    } else 

            if("GetReportJobStatus".equals(methodName)){
                
                com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse getAnalyticsReportJobStatusResponse28 = null;
	                        com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest wrappedParam =
                                                             (com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAnalyticsReportJobStatusResponse28 =
                                                   
                                                   
                                                         skel.GetReportJobStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAnalyticsReportJobStatusResponse28, false);
                                    } else 

            if("DeleteReport".equals(methodName)){
                
                com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest wrappedParam =
                                                             (com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteReport(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetReportAsURL".equals(methodName)){
                
                com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse getAnalyticsReportAsURLResponse34 = null;
	                        com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest wrappedParam =
                                                             (com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAnalyticsReportAsURLResponse34 =
                                                   
                                                   
                                                         skel.GetReportAsURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAnalyticsReportAsURLResponse34, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse wrapGetReportsLastAggregationTime(){
                                com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse wrappedElement = new com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse wrapInitiateReportJob(){
                                com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse wrappedElement = new com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse wrapGetReportJobStatus(){
                                com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse wrappedElement = new com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse wrapGetReportAsURL(){
                                com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse wrappedElement = new com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse();
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
        
                if (com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.GetReportsLastAggregationTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.analytics.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.analytics.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    