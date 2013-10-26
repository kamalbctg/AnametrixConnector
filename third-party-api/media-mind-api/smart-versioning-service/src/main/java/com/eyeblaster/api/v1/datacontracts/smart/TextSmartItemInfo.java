
/**
 * TextSmartItemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.eyeblaster.api.v1.datacontracts.smart;
            

            /**
            *  TextSmartItemInfo bean class
            */
        
        public  class TextSmartItemInfo extends com.eyeblaster.api.v1.datacontracts.smart.SmartItemInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TextSmartItemInfo
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
                        * field for AllowEditFontAsset
                        */

                        
                                    protected boolean localAllowEditFontAsset ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowEditFontAsset(){
                               return localAllowEditFontAsset;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowEditFontAsset
                               */
                               public void setAllowEditFontAsset(boolean param){
                            
                                            this.localAllowEditFontAsset=param;
                                    

                               }
                            

                        /**
                        * field for AllowEditFontColor
                        */

                        
                                    protected boolean localAllowEditFontColor ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowEditFontColor(){
                               return localAllowEditFontColor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowEditFontColor
                               */
                               public void setAllowEditFontColor(boolean param){
                            
                                            this.localAllowEditFontColor=param;
                                    

                               }
                            

                        /**
                        * field for AllowEditFontSize
                        */

                        
                                    protected boolean localAllowEditFontSize ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowEditFontSize(){
                               return localAllowEditFontSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowEditFontSize
                               */
                               public void setAllowEditFontSize(boolean param){
                            
                                            this.localAllowEditFontSize=param;
                                    

                               }
                            

                        /**
                        * field for AllowEditFontWeight
                        */

                        
                                    protected boolean localAllowEditFontWeight ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowEditFontWeight(){
                               return localAllowEditFontWeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowEditFontWeight
                               */
                               public void setAllowEditFontWeight(boolean param){
                            
                                            this.localAllowEditFontWeight=param;
                                    

                               }
                            

                        /**
                        * field for AllowEditNotification
                        */

                        
                                    protected boolean localAllowEditNotification ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowEditNotification(){
                               return localAllowEditNotification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowEditNotification
                               */
                               public void setAllowEditNotification(boolean param){
                            
                                            this.localAllowEditNotification=param;
                                    

                               }
                            

                        /**
                        * field for Color
                        */

                        
                                    protected java.lang.String localColor ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getColor(){
                               return localColor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Color
                               */
                               public void setColor(java.lang.String param){
                            
                                            this.localColor=param;
                                    

                               }
                            

                        /**
                        * field for FontAssetPossibleValues
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.ArrayOfBasicInfo localFontAssetPossibleValues ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.ArrayOfBasicInfo
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.ArrayOfBasicInfo getFontAssetPossibleValues(){
                               return localFontAssetPossibleValues;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FontAssetPossibleValues
                               */
                               public void setFontAssetPossibleValues(com.eyeblaster.api.v1.datacontracts.smart.ArrayOfBasicInfo param){
                            
                                            this.localFontAssetPossibleValues=param;
                                    

                               }
                            

                        /**
                        * field for FontResource
                        */

                        
                                    protected int localFontResource ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFontResource(){
                               return localFontResource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FontResource
                               */
                               public void setFontResource(int param){
                            
                                            this.localFontResource=param;
                                    

                               }
                            

                        /**
                        * field for FontSize
                        */

                        
                                    protected double localFontSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFontSizeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getFontSize(){
                               return localFontSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FontSize
                               */
                               public void setFontSize(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localFontSizeTracker = true;
                                              
                                       } else {
                                          localFontSizeTracker = true;
                                       }
                                   
                                            this.localFontSize=param;
                                    

                               }
                            

                        /**
                        * field for FontWeight
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.FontWeight localFontWeight ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.FontWeight
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.FontWeight getFontWeight(){
                               return localFontWeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FontWeight
                               */
                               public void setFontWeight(com.eyeblaster.api.v1.datacontracts.smart.FontWeight param){
                            
                                            this.localFontWeight=param;
                                    

                               }
                            

                        /**
                        * field for OnlineNotification
                        */

                        
                                    protected boolean localOnlineNotification ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnlineNotificationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOnlineNotification(){
                               return localOnlineNotification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnlineNotification
                               */
                               public void setOnlineNotification(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localOnlineNotificationTracker = false;
                                              
                                       } else {
                                          localOnlineNotificationTracker = true;
                                       }
                                   
                                            this.localOnlineNotification=param;
                                    

                               }
                            

                        /**
                        * field for OnlineNotificationMaxChars
                        */

                        
                                    protected int localOnlineNotificationMaxChars ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnlineNotificationMaxCharsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOnlineNotificationMaxChars(){
                               return localOnlineNotificationMaxChars;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnlineNotificationMaxChars
                               */
                               public void setOnlineNotificationMaxChars(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localOnlineNotificationMaxCharsTracker = true;
                                              
                                       } else {
                                          localOnlineNotificationMaxCharsTracker = true;
                                       }
                                   
                                            this.localOnlineNotificationMaxChars=param;
                                    

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
                       TextSmartItemInfo.this.serialize(parentQName,factory,xmlWriter);
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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://api.eyeblaster.com/V1/DataContracts");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TextSmartItemInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TextSmartItemInfo",
                           xmlWriter);
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

                                            xmlWriter.writeStartElement(prefix,"SmartItemName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SmartItemName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SmartItemName");
                                    }
                                

                                          if (localSmartItemName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSmartItemName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SmartItemSelectedValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SmartItemSelectedValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SmartItemSelectedValue");
                                    }
                                

                                          if (localSmartItemSelectedValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSmartItemSelectedValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localSmartItemStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SmartItemStatus cannot be null!!");
                                            }
                                           localSmartItemStatus.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItemStatus"),
                                               factory,xmlWriter);
                                        
                                            if (localSmartItemType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SmartItemType cannot be null!!");
                                            }
                                           localSmartItemType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItemType"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowEditFontAsset", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowEditFontAsset");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowEditFontAsset");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowEditFontAsset cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontAsset));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowEditFontColor", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowEditFontColor");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowEditFontColor");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowEditFontColor cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontColor));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowEditFontSize", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowEditFontSize");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowEditFontSize");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowEditFontSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowEditFontWeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowEditFontWeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowEditFontWeight");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowEditFontWeight cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontWeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowEditNotification", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowEditNotification");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowEditNotification");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowEditNotification cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditNotification));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Color", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Color");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Color");
                                    }
                                

                                          if (localColor==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localColor);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localFontAssetPossibleValues==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"FontAssetPossibleValues", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"FontAssetPossibleValues");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("FontAssetPossibleValues");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFontAssetPossibleValues.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FontAssetPossibleValues"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FontResource", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FontResource");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FontResource");
                                    }
                                
                                               if (localFontResource==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFontResource));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localFontSizeTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FontSize", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FontSize");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FontSize");
                                    }
                                
                                               if (java.lang.Double.isNaN(localFontSize)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFontSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    if (localFontWeight==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"FontWeight", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"FontWeight");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("FontWeight");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFontWeight.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FontWeight"),
                                        factory,xmlWriter);
                                    }
                                 if (localOnlineNotificationTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnlineNotification", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnlineNotification");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnlineNotification");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("OnlineNotification cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnlineNotification));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnlineNotificationMaxCharsTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnlineNotificationMaxChars", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnlineNotificationMaxChars");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnlineNotificationMaxChars");
                                    }
                                
                                               if (localOnlineNotificationMaxChars==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnlineNotificationMaxChars));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TextSmartItemInfo"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SmartItemName"));
                                 
                                         elementList.add(localSmartItemName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartItemName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SmartItemSelectedValue"));
                                 
                                         elementList.add(localSmartItemSelectedValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartItemSelectedValue));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SmartItemStatus"));
                            
                            
                                    if (localSmartItemStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("SmartItemStatus cannot be null!!");
                                    }
                                    elementList.add(localSmartItemStatus);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SmartItemType"));
                            
                            
                                    if (localSmartItemType==null){
                                         throw new org.apache.axis2.databinding.ADBException("SmartItemType cannot be null!!");
                                    }
                                    elementList.add(localSmartItemType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AllowEditFontAsset"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontAsset));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AllowEditFontColor"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontColor));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AllowEditFontSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontSize));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AllowEditFontWeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditFontWeight));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AllowEditNotification"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowEditNotification));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Color"));
                                 
                                         elementList.add(localColor==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColor));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FontAssetPossibleValues"));
                            
                            
                                    elementList.add(localFontAssetPossibleValues==null?null:
                                    localFontAssetPossibleValues);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FontResource"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFontResource));
                             if (localFontSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FontSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFontSize));
                            }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FontWeight"));
                            
                            
                                    elementList.add(localFontWeight==null?null:
                                    localFontWeight);
                                 if (localOnlineNotificationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "OnlineNotification"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnlineNotification));
                            } if (localOnlineNotificationMaxCharsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "OnlineNotificationMaxChars"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnlineNotificationMaxChars));
                            }

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
        public static TextSmartItemInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TextSmartItemInfo object =
                new TextSmartItemInfo();

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
                    
                            if (!"TextSmartItemInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TextSmartItemInfo)com.eyeblaster.api.message.smart.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItemName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartItemName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItemSelectedValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartItemSelectedValue(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItemStatus").equals(reader.getName())){
                                
                                                object.setSmartItemStatus(com.eyeblaster.api.v1.datacontracts.smart.SmartItemStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SmartItemType").equals(reader.getName())){
                                
                                                object.setSmartItemType(com.eyeblaster.api.v1.datacontracts.smart.SmartItemTypeV2.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AllowEditFontAsset").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowEditFontAsset(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AllowEditFontColor").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowEditFontColor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AllowEditFontSize").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowEditFontSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AllowEditFontWeight").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowEditFontWeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AllowEditNotification").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowEditNotification(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Color").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setColor(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FontAssetPossibleValues").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFontAssetPossibleValues(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFontAssetPossibleValues(com.eyeblaster.api.v1.datacontracts.smart.ArrayOfBasicInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FontResource").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFontResource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setFontResource(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FontSize").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFontSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setFontSize(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFontSize(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FontWeight").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFontWeight(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFontWeight(com.eyeblaster.api.v1.datacontracts.smart.FontWeight.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","OnlineNotification").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnlineNotification(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","OnlineNotificationMaxChars").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnlineNotificationMaxChars(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setOnlineNotificationMaxChars(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOnlineNotificationMaxChars(java.lang.Integer.MIN_VALUE);
                                           
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
           
          