
/**
 * SVProVersionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.eyeblaster.api.v1.datacontracts.smart;
            

            /**
            *  SVProVersionInfo bean class
            */
        
        public  class SVProVersionInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SVProVersionInfo
                Namespace URI = http://api.eyeblaster.com/V1/DataContracts
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://api.eyeblaster.com/V1/DataContracts")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for AdID
                        */

                        
                                    protected int localAdID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAdID(){
                               return localAdID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdID
                               */
                               public void setAdID(int param){
                            
                                            this.localAdID=param;
                                    

                               }
                            

                        /**
                        * field for ClickthroughURL
                        */

                        
                                    protected java.lang.String localClickthroughURL ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClickthroughURL(){
                               return localClickthroughURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClickthroughURL
                               */
                               public void setClickthroughURL(java.lang.String param){
                            
                                            this.localClickthroughURL=param;
                                    

                               }
                            

                        /**
                        * field for Enabled
                        */

                        
                                    protected boolean localEnabled ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnabled(){
                               return localEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Enabled
                               */
                               public void setEnabled(boolean param){
                            
                                            this.localEnabled=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.APIDateTime localEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.APIDateTime
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.APIDateTime getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime param){
                            
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for EndingHours
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.APIDateTime localEndingHours ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.APIDateTime
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.APIDateTime getEndingHours(){
                               return localEndingHours;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndingHours
                               */
                               public void setEndingHours(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime param){
                            
                                            this.localEndingHours=param;
                                    

                               }
                            

                        /**
                        * field for FeedUniqueIdentifier
                        */

                        
                                    protected java.lang.String localFeedUniqueIdentifier ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFeedUniqueIdentifier(){
                               return localFeedUniqueIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FeedUniqueIdentifier
                               */
                               public void setFeedUniqueIdentifier(java.lang.String param){
                            
                                            this.localFeedUniqueIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for ReportClassification
                        */

                        
                                    protected java.lang.String localReportClassification ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportClassification(){
                               return localReportClassification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportClassification
                               */
                               public void setReportClassification(java.lang.String param){
                            
                                            this.localReportClassification=param;
                                    

                               }
                            

                        /**
                        * field for RetargetingID
                        */

                        
                                    protected int localRetargetingID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRetargetingID(){
                               return localRetargetingID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetargetingID
                               */
                               public void setRetargetingID(int param){
                            
                                            this.localRetargetingID=param;
                                    

                               }
                            

                        /**
                        * field for SmartItems
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.ArrayOfSmartItemInfo localSmartItems ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.ArrayOfSmartItemInfo
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.ArrayOfSmartItemInfo getSmartItems(){
                               return localSmartItems;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmartItems
                               */
                               public void setSmartItems(com.eyeblaster.api.v1.datacontracts.smart.ArrayOfSmartItemInfo param){
                            
                                            this.localSmartItems=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.APIDateTime localStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.APIDateTime
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.APIDateTime getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime param){
                            
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for StartingHours
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.APIDateTime localStartingHours ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.APIDateTime
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.APIDateTime getStartingHours(){
                               return localStartingHours;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartingHours
                               */
                               public void setStartingHours(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime param){
                            
                                            this.localStartingHours=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.SmartItemStatus localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.SmartItemStatus
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.SmartItemStatus getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.eyeblaster.api.v1.datacontracts.smart.SmartItemStatus param){
                            
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for ThirdPartyClickthroughURL
                        */

                        
                                    protected java.lang.String localThirdPartyClickthroughURL ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getThirdPartyClickthroughURL(){
                               return localThirdPartyClickthroughURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ThirdPartyClickthroughURL
                               */
                               public void setThirdPartyClickthroughURL(java.lang.String param){
                            
                                            this.localThirdPartyClickthroughURL=param;
                                    

                               }
                            

                        /**
                        * field for ThirdPartyImpressionURL
                        */

                        
                                    protected java.lang.String localThirdPartyImpressionURL ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getThirdPartyImpressionURL(){
                               return localThirdPartyImpressionURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ThirdPartyImpressionURL
                               */
                               public void setThirdPartyImpressionURL(java.lang.String param){
                            
                                            this.localThirdPartyImpressionURL=param;
                                    

                               }
                            

                        /**
                        * field for VersionID
                        */

                        
                                    protected int localVersionID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getVersionID(){
                               return localVersionID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VersionID
                               */
                               public void setVersionID(int param){
                            
                                            this.localVersionID=param;
                                    

                               }
                            

                        /**
                        * field for Weight
                        */

                        
                                    protected int localWeight ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getWeight(){
                               return localWeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Weight
                               */
                               public void setWeight(int param){
                            
                                            this.localWeight=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       SVProVersionInfo.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://api.eyeblaster.com/V1/DataContracts");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SVProVersionInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SVProVersionInfo",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdID");
                                    }
                                
                                               if (localAdID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AdID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ClickthroughURL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ClickthroughURL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ClickthroughURL");
                                    }
                                

                                          if (localClickthroughURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClickthroughURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Enabled", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Enabled");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Enabled");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Enabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localEndDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"EndDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"EndDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("EndDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEndDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","EndDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localEndingHours==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"EndingHours", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"EndingHours");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("EndingHours");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEndingHours.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","EndingHours"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FeedUniqueIdentifier", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FeedUniqueIdentifier");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FeedUniqueIdentifier");
                                    }
                                

                                          if (localFeedUniqueIdentifier==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFeedUniqueIdentifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReportClassification", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReportClassification");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReportClassification");
                                    }
                                

                                          if (localReportClassification==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportClassification);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RetargetingID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RetargetingID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RetargetingID");
                                    }
                                
                                               if (localRetargetingID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetargetingID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localSmartItems==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SmartItems", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SmartItems");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SmartItems");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSmartItems.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItems"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localStartDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"StartDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"StartDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("StartDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStartDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StartDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localStartingHours==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"StartingHours", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"StartingHours");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("StartingHours");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStartingHours.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StartingHours"),
                                        factory,xmlWriter);
                                    }
                                
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Status"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ThirdPartyClickthroughURL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ThirdPartyClickthroughURL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ThirdPartyClickthroughURL");
                                    }
                                

                                          if (localThirdPartyClickthroughURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localThirdPartyClickthroughURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ThirdPartyImpressionURL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ThirdPartyImpressionURL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ThirdPartyImpressionURL");
                                    }
                                

                                          if (localThirdPartyImpressionURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localThirdPartyImpressionURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"VersionID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"VersionID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("VersionID");
                                    }
                                
                                               if (localVersionID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("VersionID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersionID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Weight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Weight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Weight");
                                    }
                                
                                               if (localWeight==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ClickthroughURL"));
                                 
                                         elementList.add(localClickthroughURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClickthroughURL));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Enabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnabled));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "EndDate"));
                            
                            
                                    elementList.add(localEndDate==null?null:
                                    localEndDate);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "EndingHours"));
                            
                            
                                    elementList.add(localEndingHours==null?null:
                                    localEndingHours);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FeedUniqueIdentifier"));
                                 
                                         elementList.add(localFeedUniqueIdentifier==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeedUniqueIdentifier));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ReportClassification"));
                                 
                                         elementList.add(localReportClassification==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportClassification));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "RetargetingID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetargetingID));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SmartItems"));
                            
                            
                                    elementList.add(localSmartItems==null?null:
                                    localSmartItems);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "StartDate"));
                            
                            
                                    elementList.add(localStartDate==null?null:
                                    localStartDate);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "StartingHours"));
                            
                            
                                    elementList.add(localStartingHours==null?null:
                                    localStartingHours);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ThirdPartyClickthroughURL"));
                                 
                                         elementList.add(localThirdPartyClickthroughURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThirdPartyClickthroughURL));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ThirdPartyImpressionURL"));
                                 
                                         elementList.add(localThirdPartyImpressionURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThirdPartyImpressionURL));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "VersionID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersionID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Weight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWeight));
                            

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SVProVersionInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SVProVersionInfo object =
                new SVProVersionInfo();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"SVProVersionInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SVProVersionInfo)com.eyeblaster.api.message.smart.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ClickthroughURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClickthroughURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Enabled").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","EndDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEndDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEndDate(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","EndingHours").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEndingHours(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEndingHours(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FeedUniqueIdentifier").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFeedUniqueIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ReportClassification").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportClassification(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RetargetingID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetargetingID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRetargetingID(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItems").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSmartItems(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSmartItems(com.eyeblaster.api.v1.datacontracts.smart.ArrayOfSmartItemInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StartDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStartDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStartDate(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StartingHours").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStartingHours(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStartingHours(com.eyeblaster.api.v1.datacontracts.smart.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Status").equals(reader.getName())){
                                
                                                object.setStatus(com.eyeblaster.api.v1.datacontracts.smart.SmartItemStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ThirdPartyClickthroughURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setThirdPartyClickthroughURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ThirdPartyImpressionURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setThirdPartyImpressionURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","VersionID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVersionID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Weight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setWeight(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          