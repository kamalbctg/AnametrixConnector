
/**
 * AuthenticationServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.auth;

        /**
        *  AuthenticationServiceMessageReceiverInOut message receiver
        */

        public class AuthenticationServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AuthenticationServiceSkeleton skel = (AuthenticationServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("ClientImpersonation".equals(methodName)){
                
                api.eyeblaster.com.auth.ClientImpersonationResponse clientImpersonationResponse10 = null;
	                        api.eyeblaster.com.auth.ClientImpersonation wrappedParam =
                                                             (api.eyeblaster.com.auth.ClientImpersonation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.auth.ClientImpersonation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientImpersonationResponse10 =
                                                   
                                                   
                                                         skel.ClientImpersonation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientImpersonationResponse10, false);
                                    } else 

            if("ClientLogin".equals(methodName)){
                
                api.eyeblaster.com.auth.ClientLoginResponse clientLoginResponse12 = null;
	                        api.eyeblaster.com.auth.ClientLogin wrappedParam =
                                                             (api.eyeblaster.com.auth.ClientLogin)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.auth.ClientLogin.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientLoginResponse12 =
                                                   
                                                   
                                                         skel.ClientLogin(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientLoginResponse12, false);
                                    } else 

            if("GetClientInfo".equals(methodName)){
                
                com.eyeblaster.api.message.auth.GetClientInfoResponse getClientInfoResponse15 = null;
	                        com.eyeblaster.api.message.auth.GetClientInfoRequest wrappedParam =
                                                             (com.eyeblaster.api.message.auth.GetClientInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.eyeblaster.api.message.auth.GetClientInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getClientInfoResponse15 =
                                                   
                                                   
                                                         skel.GetClientInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getClientInfoResponse15, false);
                                    } else 

            if("ClientLogout".equals(methodName)){
                
                api.eyeblaster.com.auth.ClientLogoutResponse clientLogoutResponse17 = null;
	                        api.eyeblaster.com.auth.ClientLogout wrappedParam =
                                                             (api.eyeblaster.com.auth.ClientLogout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.auth.ClientLogout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientLogoutResponse17 =
                                                   
                                                   
                                                         skel.ClientLogout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientLogoutResponse17, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.auth.ClientImpersonation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.auth.ClientImpersonation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.auth.ClientImpersonationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.auth.ClientImpersonationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.auth.ClientLogin param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.auth.ClientLogin.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.auth.ClientLoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.auth.ClientLoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.auth.GetClientInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.auth.GetClientInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.auth.GetClientInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.auth.GetClientInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.eyeblaster.api.message.auth.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.eyeblaster.api.message.auth.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.auth.ClientLogout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.auth.ClientLogout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.auth.ClientLogoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.auth.ClientLogoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.auth.ClientImpersonationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.auth.ClientImpersonationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.auth.ClientImpersonationResponse wrapClientImpersonation(){
                                api.eyeblaster.com.auth.ClientImpersonationResponse wrappedElement = new api.eyeblaster.com.auth.ClientImpersonationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.auth.ClientLoginResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.auth.ClientLoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.auth.ClientLoginResponse wrapClientLogin(){
                                api.eyeblaster.com.auth.ClientLoginResponse wrappedElement = new api.eyeblaster.com.auth.ClientLoginResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.auth.GetClientInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.auth.GetClientInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.eyeblaster.api.message.auth.GetClientInfoResponse wrapGetClientInfo(){
                                com.eyeblaster.api.message.auth.GetClientInfoResponse wrappedElement = new com.eyeblaster.api.message.auth.GetClientInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.auth.ClientLogoutResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.auth.ClientLogoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.auth.ClientLogoutResponse wrapClientLogout(){
                                api.eyeblaster.com.auth.ClientLogoutResponse wrappedElement = new api.eyeblaster.com.auth.ClientLogoutResponse();
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
        
                if (api.eyeblaster.com.auth.ClientImpersonation.class.equals(type)){
                
                           return api.eyeblaster.com.auth.ClientImpersonation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.auth.ClientImpersonationResponse.class.equals(type)){
                
                           return api.eyeblaster.com.auth.ClientImpersonationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.auth.ClientLogin.class.equals(type)){
                
                           return api.eyeblaster.com.auth.ClientLogin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.auth.ClientLoginResponse.class.equals(type)){
                
                           return api.eyeblaster.com.auth.ClientLoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.auth.GetClientInfoRequest.class.equals(type)){
                
                           return com.eyeblaster.api.message.auth.GetClientInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.auth.GetClientInfoResponse.class.equals(type)){
                
                           return com.eyeblaster.api.message.auth.GetClientInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.eyeblaster.api.message.auth.UserSecurityToken.class.equals(type)){
                
                           return com.eyeblaster.api.message.auth.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.auth.ClientLogout.class.equals(type)){
                
                           return api.eyeblaster.com.auth.ClientLogout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.auth.ClientLogoutResponse.class.equals(type)){
                
                           return api.eyeblaster.com.auth.ClientLogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    