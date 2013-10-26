
/**
 * AdvertiserServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.advertiser;

        

        /*
        *  AdvertiserServiceStub java implementation
        */

        
        public class AdvertiserServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("AdvertiserService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[26];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetMarkets"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateConversionTagType"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteBrand"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateConversionTags"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateBrand"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetConversionTagsThirdParty"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteAdvertiser"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateBrand"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetOffices"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertiserHistoryActions"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateConversionTag"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateAdvertiser"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteConversionTagThirdParty"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertiserHistoryObjects"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetCurrencies"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateAdvertiser"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetBrands"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteConversionTags"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateConversionTag"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetConversionTagCode"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateConversionTagThirdParty"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetConversionTags"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertisers"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertiserHistory"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateConversionTagThirdParty"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetSites"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"AdvertiserService_Binding_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[25]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public AdvertiserServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public AdvertiserServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
        _service.applyPolicy();
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public AdvertiserServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://platform.mediamind.com/Eyeblaster.MediaMind.API/V2/AdvertiserService.svc" );
                
    }

    /**
     * Default Constructor
     */
    public AdvertiserServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://platform.mediamind.com/Eyeblaster.MediaMind.API/V2/AdvertiserService.svc" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public AdvertiserServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetMarkets
                     * @param getMarketsRequest339
                    
                     * @param userSecurityToken340
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetMarketsResponse GetMarkets(

                            com.eyeblaster.api.message.advertiser.GetMarketsRequest getMarketsRequest339,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken340)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetMarkets");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMarketsRequest339,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetMarkets")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken340!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken340 = toOM(userSecurityToken340, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetMarkets")));
                                                    addHeader(omElementuserSecurityToken340,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetMarketsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetMarketsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#UpdateConversionTagType
                     * @param updateConversionTagTypeRequest342
                    
                     * @param userSecurityToken343
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse UpdateConversionTagType(

                            com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest updateConversionTagTypeRequest342,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken343)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/UpdateConversionTagType");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateConversionTagTypeRequest342,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "UpdateConversionTagType")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken343!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken343 = toOM(userSecurityToken343, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateConversionTagType")));
                                                    addHeader(omElementuserSecurityToken343,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#DeleteBrand
                     * @param deleteBrandRequest345
                    
                     * @param userSecurityToken346
                    
                     */

                    

                            public  void DeleteBrand(

                            com.eyeblaster.api.message.advertiser.DeleteBrandRequest deleteBrandRequest345,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken346)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/DeleteBrand");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteBrandRequest345,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "DeleteBrand")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken346!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken346 = toOM(userSecurityToken346, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteBrand")));
                                                    addHeader(omElementuserSecurityToken346,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#CreateConversionTags
                     * @param createConversionTagsRequest348
                    
                     * @param userSecurityToken349
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse CreateConversionTags(

                            com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest createConversionTagsRequest348,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken349)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/CreateConversionTags");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createConversionTagsRequest348,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "CreateConversionTags")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken349!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken349 = toOM(userSecurityToken349, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateConversionTags")));
                                                    addHeader(omElementuserSecurityToken349,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.CreateConversionTagsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#CreateBrand
                     * @param createBrandRequest351
                    
                     * @param userSecurityToken352
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.CreateBrandResponse CreateBrand(

                            com.eyeblaster.api.message.advertiser.CreateBrandRequest createBrandRequest351,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken352)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/CreateBrand");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createBrandRequest351,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "CreateBrand")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken352!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken352 = toOM(userSecurityToken352, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateBrand")));
                                                    addHeader(omElementuserSecurityToken352,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.CreateBrandResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.CreateBrandResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetConversionTagsThirdParty
                     * @param getConversionTagThirdPartyRequest354
                    
                     * @param userSecurityToken355
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse GetConversionTagsThirdParty(

                            com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest getConversionTagThirdPartyRequest354,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken355)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetConversionTagsThirdParty");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getConversionTagThirdPartyRequest354,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetConversionTagsThirdParty")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken355!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken355 = toOM(userSecurityToken355, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetConversionTagsThirdParty")));
                                                    addHeader(omElementuserSecurityToken355,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetConversionTagsThirdPartyResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#DeleteAdvertiser
                     * @param deleteAdvertiserRequest357
                    
                     * @param userSecurityToken358
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse DeleteAdvertiser(

                            com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest deleteAdvertiserRequest357,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken358)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/DeleteAdvertiser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteAdvertiserRequest357,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "DeleteAdvertiser")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken358!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken358 = toOM(userSecurityToken358, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteAdvertiser")));
                                                    addHeader(omElementuserSecurityToken358,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.DeleteAdvertiserResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#UpdateBrand
                     * @param updateBrandRequest360
                    
                     * @param userSecurityToken361
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.UpdateBrandResponse UpdateBrand(

                            com.eyeblaster.api.message.advertiser.UpdateBrandRequest updateBrandRequest360,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken361)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/UpdateBrand");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateBrandRequest360,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "UpdateBrand")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken361!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken361 = toOM(userSecurityToken361, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateBrand")));
                                                    addHeader(omElementuserSecurityToken361,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.UpdateBrandResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.UpdateBrandResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetOffices
                     * @param getOfficesRequest363
                    
                     * @param userSecurityToken364
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetOfficesResponse GetOffices(

                            com.eyeblaster.api.message.advertiser.GetOfficesRequest getOfficesRequest363,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken364)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetOffices");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getOfficesRequest363,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetOffices")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken364!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken364 = toOM(userSecurityToken364, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetOffices")));
                                                    addHeader(omElementuserSecurityToken364,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetOfficesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetOfficesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetAdvertiserHistoryActions
                     * @param getHistoryActionsRequest366
                    
                     * @param userSecurityToken367
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse GetAdvertiserHistoryActions(

                            com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest getHistoryActionsRequest366,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken367)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetAdvertiserHistoryActions");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getHistoryActionsRequest366,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetAdvertiserHistoryActions")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken367!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken367 = toOM(userSecurityToken367, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertiserHistoryActions")));
                                                    addHeader(omElementuserSecurityToken367,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetHistoryActionsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#CreateConversionTag
                     * @param createConversionTagRequest369
                    
                     * @param userSecurityToken370
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.CreateConversionTagResponse CreateConversionTag(

                            com.eyeblaster.api.message.advertiser.CreateConversionTagRequest createConversionTagRequest369,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken370)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/CreateConversionTag");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createConversionTagRequest369,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "CreateConversionTag")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken370!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken370 = toOM(userSecurityToken370, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateConversionTag")));
                                                    addHeader(omElementuserSecurityToken370,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.CreateConversionTagResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.CreateConversionTagResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#UpdateAdvertiser
                     * @param updateAdvertiserRequest372
                    
                     * @param userSecurityToken373
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse UpdateAdvertiser(

                            com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest updateAdvertiserRequest372,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken373)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/UpdateAdvertiser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateAdvertiserRequest372,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "UpdateAdvertiser")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken373!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken373 = toOM(userSecurityToken373, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateAdvertiser")));
                                                    addHeader(omElementuserSecurityToken373,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.UpdateAdvertiserResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#DeleteConversionTagThirdParty
                     * @param deleteConversionTagThirdPartyRequest375
                    
                     * @param userSecurityToken376
                    
                     */

                    

                            public  void DeleteConversionTagThirdParty(

                            com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest deleteConversionTagThirdPartyRequest375,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken376)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/DeleteConversionTagThirdParty");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteConversionTagThirdPartyRequest375,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "DeleteConversionTagThirdParty")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken376!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken376 = toOM(userSecurityToken376, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteConversionTagThirdParty")));
                                                    addHeader(omElementuserSecurityToken376,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetAdvertiserHistoryObjects
                     * @param getHistoryObjectsRequest378
                    
                     * @param userSecurityToken379
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse GetAdvertiserHistoryObjects(

                            com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest getHistoryObjectsRequest378,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken379)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetAdvertiserHistoryObjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getHistoryObjectsRequest378,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetAdvertiserHistoryObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken379!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken379 = toOM(userSecurityToken379, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertiserHistoryObjects")));
                                                    addHeader(omElementuserSecurityToken379,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetHistoryObjectsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetCurrencies
                     * @param getCurrenciesRequest381
                    
                     * @param userSecurityToken382
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetCurrenciesResponse GetCurrencies(

                            com.eyeblaster.api.message.advertiser.GetCurrenciesRequest getCurrenciesRequest381,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken382)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetCurrencies");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCurrenciesRequest381,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetCurrencies")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken382!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken382 = toOM(userSecurityToken382, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetCurrencies")));
                                                    addHeader(omElementuserSecurityToken382,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetCurrenciesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetCurrenciesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#CreateAdvertiser
                     * @param createAdvertiserRequest384
                    
                     * @param userSecurityToken385
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse CreateAdvertiser(

                            com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest createAdvertiserRequest384,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken385)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/CreateAdvertiser");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createAdvertiserRequest384,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "CreateAdvertiser")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken385!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken385 = toOM(userSecurityToken385, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateAdvertiser")));
                                                    addHeader(omElementuserSecurityToken385,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.CreateAdvertiserResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetBrands
                     * @param getBrandsRequest387
                    
                     * @param userSecurityToken388
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetBrandsResponse GetBrands(

                            com.eyeblaster.api.message.advertiser.GetBrandsRequest getBrandsRequest387,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken388)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetBrands");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getBrandsRequest387,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetBrands")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken388!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken388 = toOM(userSecurityToken388, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetBrands")));
                                                    addHeader(omElementuserSecurityToken388,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetBrandsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetBrandsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#DeleteConversionTags
                     * @param deleteConversionTagsRequest390
                    
                     * @param userSecurityToken391
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse DeleteConversionTags(

                            com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest deleteConversionTagsRequest390,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken391)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/DeleteConversionTags");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteConversionTagsRequest390,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "DeleteConversionTags")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken391!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken391 = toOM(userSecurityToken391, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "DeleteConversionTags")));
                                                    addHeader(omElementuserSecurityToken391,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.DeleteConversionTagsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#UpdateConversionTag
                     * @param updateConversionTagRequest393
                    
                     * @param userSecurityToken394
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse UpdateConversionTag(

                            com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest updateConversionTagRequest393,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken394)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/UpdateConversionTag");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateConversionTagRequest393,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "UpdateConversionTag")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken394!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken394 = toOM(userSecurityToken394, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateConversionTag")));
                                                    addHeader(omElementuserSecurityToken394,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.UpdateConversionTagResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetConversionTagCode
                     * @param conversionTagCodeRequest396
                    
                     * @param userSecurityToken397
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse GetConversionTagCode(

                            com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest conversionTagCodeRequest396,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken397)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetConversionTagCode");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    conversionTagCodeRequest396,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetConversionTagCode")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken397!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken397 = toOM(userSecurityToken397, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetConversionTagCode")));
                                                    addHeader(omElementuserSecurityToken397,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.ConversionTagCodeResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#CreateConversionTagThirdParty
                     * @param createConversionTagThirdPartyRequest399
                    
                     * @param userSecurityToken400
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse CreateConversionTagThirdParty(

                            com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest createConversionTagThirdPartyRequest399,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken400)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/CreateConversionTagThirdParty");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createConversionTagThirdPartyRequest399,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "CreateConversionTagThirdParty")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken400!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken400 = toOM(userSecurityToken400, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "CreateConversionTagThirdParty")));
                                                    addHeader(omElementuserSecurityToken400,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetConversionTags
                     * @param getConversionTagsRequest402
                    
                     * @param userSecurityToken403
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetConversionTagsResponse GetConversionTags(

                            com.eyeblaster.api.message.advertiser.GetConversionTagsRequest getConversionTagsRequest402,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken403)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetConversionTags");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getConversionTagsRequest402,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetConversionTags")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken403!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken403 = toOM(userSecurityToken403, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetConversionTags")));
                                                    addHeader(omElementuserSecurityToken403,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetConversionTagsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetConversionTagsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetAdvertisers
                     * @param getAdvertisersRequest405
                    
                     * @param userSecurityToken406
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetAdvertisersResponse GetAdvertisers(

                            com.eyeblaster.api.message.advertiser.GetAdvertisersRequest getAdvertisersRequest405,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken406)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetAdvertisers");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAdvertisersRequest405,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetAdvertisers")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken406!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken406 = toOM(userSecurityToken406, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertisers")));
                                                    addHeader(omElementuserSecurityToken406,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetAdvertisersResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetAdvertisersResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetAdvertiserHistory
                     * @param getAdvertiserHistoryRequest408
                    
                     * @param userSecurityToken409
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetHistoryResponse GetAdvertiserHistory(

                            com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest getAdvertiserHistoryRequest408,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken409)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetAdvertiserHistory");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAdvertiserHistoryRequest408,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetAdvertiserHistory")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken409!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken409 = toOM(userSecurityToken409, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetAdvertiserHistory")));
                                                    addHeader(omElementuserSecurityToken409,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetHistoryResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetHistoryResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#UpdateConversionTagThirdParty
                     * @param updateConversionTagThirdPartyRequest411
                    
                     * @param userSecurityToken412
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse UpdateConversionTagThirdParty(

                            com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest updateConversionTagThirdPartyRequest411,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken412)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/UpdateConversionTagThirdParty");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateConversionTagThirdPartyRequest411,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "UpdateConversionTagThirdParty")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken412!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken412 = toOM(userSecurityToken412, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "UpdateConversionTagThirdParty")));
                                                    addHeader(omElementuserSecurityToken412,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see api.eyeblaster.com.advertiser.AdvertiserService#GetSites
                     * @param getSitesRequest414
                    
                     * @param userSecurityToken415
                    
                     */

                    

                            public  com.eyeblaster.api.message.advertiser.GetSitesResponse GetSites(

                            com.eyeblaster.api.message.advertiser.GetSitesRequest getSitesRequest414,com.eyeblaster.api.message.advertiser.UserSecurityToken userSecurityToken415)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("http://api.eyeblaster.com/IAdvertiserService/GetSites");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSitesRequest414,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/",
                                                    "GetSites")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (userSecurityToken415!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserSecurityToken415 = toOM(userSecurityToken415, optimizeContent(new javax.xml.namespace.QName("http://api.eyeblaster.com/", "GetSites")));
                                                    addHeader(omElementuserSecurityToken415,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.eyeblaster.api.message.advertiser.GetSitesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.eyeblaster.api.message.advertiser.GetSitesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
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

    
    ////////////////////////////////////////////////////////////////////////
    
    private static org.apache.neethi.Policy getPolicy (java.lang.String policyString) {
    	java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(policyString.getBytes());
    	return org.apache.neethi.PolicyEngine.getPolicy(bais);
    }
    
    /////////////////////////////////////////////////////////////////////////

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://platform.mediamind.com/Eyeblaster.MediaMind.API/V2/AdvertiserService.svc
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
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetMarketsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetMarketsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagTypeRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.DeleteBrandRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteBrandRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateBrandRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateBrandRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagThirdPartyRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteAdvertiserRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateBrandRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateBrandRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetOfficesRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetOfficesRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryActionsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateConversionTagRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateAdvertiserRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteConversionTagThirdPartyRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetHistoryObjectsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetCurrenciesRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetCurrenciesRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateAdvertiserRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetBrandsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetBrandsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.DeleteConversionTagsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.ConversionTagCodeRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.CreateConversionTagThirdPartyRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetConversionTagsRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetConversionTagsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetAdvertisersRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetAdvertisersRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetAdvertiserHistoryRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.UpdateConversionTagThirdPartyRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.eyeblaster.api.message.advertiser.GetSitesRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.eyeblaster.api.message.advertiser.GetSitesRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


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



    
   }
   