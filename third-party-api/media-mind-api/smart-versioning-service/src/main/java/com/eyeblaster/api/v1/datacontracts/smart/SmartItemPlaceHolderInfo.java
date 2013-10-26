
/**
 * SmartItemPlaceHolderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.eyeblaster.api.v1.datacontracts.smart;
            

            /**
            *  SmartItemPlaceHolderInfo bean class
            */
        
        public  class SmartItemPlaceHolderInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SmartItemPlaceHolderInfo
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
                        * field for AutoResize
                        */

                        
                                    protected boolean localAutoResize ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAutoResize(){
                               return localAutoResize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoResize
                               */
                               public void setAutoResize(boolean param){
                            
                                            this.localAutoResize=param;
                                    

                               }
                            

                        /**
                        * field for AutoResizeToHeight
                        */

                        
                                    protected double localAutoResizeToHeight ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAutoResizeToHeightTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAutoResizeToHeight(){
                               return localAutoResizeToHeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoResizeToHeight
                               */
                               public void setAutoResizeToHeight(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localAutoResizeToHeightTracker = true;
                                              
                                       } else {
                                          localAutoResizeToHeightTracker = true;
                                       }
                                   
                                            this.localAutoResizeToHeight=param;
                                    

                               }
                            

                        /**
                        * field for AutoResizeToWidth
                        */

                        
                                    protected double localAutoResizeToWidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAutoResizeToWidthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAutoResizeToWidth(){
                               return localAutoResizeToWidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoResizeToWidth
                               */
                               public void setAutoResizeToWidth(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localAutoResizeToWidthTracker = true;
                                              
                                       } else {
                                          localAutoResizeToWidthTracker = true;
                                       }
                                   
                                            this.localAutoResizeToWidth=param;
                                    

                               }
                            

                        /**
                        * field for FixedHeight
                        */

                        
                                    protected double localFixedHeight ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFixedHeightTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getFixedHeight(){
                               return localFixedHeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FixedHeight
                               */
                               public void setFixedHeight(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localFixedHeightTracker = true;
                                              
                                       } else {
                                          localFixedHeightTracker = true;
                                       }
                                   
                                            this.localFixedHeight=param;
                                    

                               }
                            

                        /**
                        * field for FixedWidth
                        */

                        
                                    protected double localFixedWidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFixedWidthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getFixedWidth(){
                               return localFixedWidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FixedWidth
                               */
                               public void setFixedWidth(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localFixedWidthTracker = true;
                                              
                                       } else {
                                          localFixedWidthTracker = true;
                                       }
                                   
                                            this.localFixedWidth=param;
                                    

                               }
                            

                        /**
                        * field for MaintainAspectRatio
                        */

                        
                                    protected boolean localMaintainAspectRatio ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMaintainAspectRatio(){
                               return localMaintainAspectRatio;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaintainAspectRatio
                               */
                               public void setMaintainAspectRatio(boolean param){
                            
                                            this.localMaintainAspectRatio=param;
                                    

                               }
                            

                        /**
                        * field for NotifyIncompatibleFileSize
                        */

                        
                                    protected boolean localNotifyIncompatibleFileSize ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNotifyIncompatibleFileSize(){
                               return localNotifyIncompatibleFileSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotifyIncompatibleFileSize
                               */
                               public void setNotifyIncompatibleFileSize(boolean param){
                            
                                            this.localNotifyIncompatibleFileSize=param;
                                    

                               }
                            

                        /**
                        * field for RangeFromHeight
                        */

                        
                                    protected double localRangeFromHeight ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRangeFromHeightTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getRangeFromHeight(){
                               return localRangeFromHeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RangeFromHeight
                               */
                               public void setRangeFromHeight(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localRangeFromHeightTracker = true;
                                              
                                       } else {
                                          localRangeFromHeightTracker = true;
                                       }
                                   
                                            this.localRangeFromHeight=param;
                                    

                               }
                            

                        /**
                        * field for RangeFromWidth
                        */

                        
                                    protected double localRangeFromWidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRangeFromWidthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getRangeFromWidth(){
                               return localRangeFromWidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RangeFromWidth
                               */
                               public void setRangeFromWidth(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localRangeFromWidthTracker = true;
                                              
                                       } else {
                                          localRangeFromWidthTracker = true;
                                       }
                                   
                                            this.localRangeFromWidth=param;
                                    

                               }
                            

                        /**
                        * field for RangeToHeight
                        */

                        
                                    protected double localRangeToHeight ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRangeToHeightTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getRangeToHeight(){
                               return localRangeToHeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RangeToHeight
                               */
                               public void setRangeToHeight(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localRangeToHeightTracker = true;
                                              
                                       } else {
                                          localRangeToHeightTracker = true;
                                       }
                                   
                                            this.localRangeToHeight=param;
                                    

                               }
                            

                        /**
                        * field for RangeToWidth
                        */

                        
                                    protected double localRangeToWidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRangeToWidthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getRangeToWidth(){
                               return localRangeToWidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RangeToWidth
                               */
                               public void setRangeToWidth(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localRangeToWidthTracker = true;
                                              
                                       } else {
                                          localRangeToWidthTracker = true;
                                       }
                                   
                                            this.localRangeToWidth=param;
                                    

                               }
                            

                        /**
                        * field for SizeChoice
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.smart.SmartItemChoice localSizeChoice ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.SmartItemChoice
                           */
                           public  com.eyeblaster.api.v1.datacontracts.smart.SmartItemChoice getSizeChoice(){
                               return localSizeChoice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SizeChoice
                               */
                               public void setSizeChoice(com.eyeblaster.api.v1.datacontracts.smart.SmartItemChoice param){
                            
                                            this.localSizeChoice=param;
                                    

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
                       SmartItemPlaceHolderInfo.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":SmartItemPlaceHolderInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SmartItemPlaceHolderInfo",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AutoResize", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AutoResize");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AutoResize");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AutoResize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoResize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localAutoResizeToHeightTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AutoResizeToHeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AutoResizeToHeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AutoResizeToHeight");
                                    }
                                
                                               if (java.lang.Double.isNaN(localAutoResizeToHeight)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoResizeToHeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAutoResizeToWidthTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AutoResizeToWidth", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AutoResizeToWidth");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AutoResizeToWidth");
                                    }
                                
                                               if (java.lang.Double.isNaN(localAutoResizeToWidth)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoResizeToWidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFixedHeightTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FixedHeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FixedHeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FixedHeight");
                                    }
                                
                                               if (java.lang.Double.isNaN(localFixedHeight)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFixedHeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFixedWidthTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FixedWidth", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FixedWidth");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FixedWidth");
                                    }
                                
                                               if (java.lang.Double.isNaN(localFixedWidth)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFixedWidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaintainAspectRatio", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaintainAspectRatio");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaintainAspectRatio");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaintainAspectRatio cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaintainAspectRatio));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"NotifyIncompatibleFileSize", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"NotifyIncompatibleFileSize");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("NotifyIncompatibleFileSize");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NotifyIncompatibleFileSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyIncompatibleFileSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localRangeFromHeightTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RangeFromHeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RangeFromHeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RangeFromHeight");
                                    }
                                
                                               if (java.lang.Double.isNaN(localRangeFromHeight)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeFromHeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRangeFromWidthTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RangeFromWidth", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RangeFromWidth");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RangeFromWidth");
                                    }
                                
                                               if (java.lang.Double.isNaN(localRangeFromWidth)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeFromWidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRangeToHeightTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RangeToHeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RangeToHeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RangeToHeight");
                                    }
                                
                                               if (java.lang.Double.isNaN(localRangeToHeight)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeToHeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRangeToWidthTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"RangeToWidth", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"RangeToWidth");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("RangeToWidth");
                                    }
                                
                                               if (java.lang.Double.isNaN(localRangeToWidth)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeToWidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localSizeChoice==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SizeChoice cannot be null!!");
                                            }
                                           localSizeChoice.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SizeChoice"),
                                               factory,xmlWriter);
                                        
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
                                                                      "AutoResize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoResize));
                             if (localAutoResizeToHeightTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AutoResizeToHeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoResizeToHeight));
                            } if (localAutoResizeToWidthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AutoResizeToWidth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoResizeToWidth));
                            } if (localFixedHeightTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FixedHeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFixedHeight));
                            } if (localFixedWidthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FixedWidth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFixedWidth));
                            }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "MaintainAspectRatio"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaintainAspectRatio));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "NotifyIncompatibleFileSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyIncompatibleFileSize));
                             if (localRangeFromHeightTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "RangeFromHeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeFromHeight));
                            } if (localRangeFromWidthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "RangeFromWidth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeFromWidth));
                            } if (localRangeToHeightTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "RangeToHeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeToHeight));
                            } if (localRangeToWidthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "RangeToWidth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRangeToWidth));
                            }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SizeChoice"));
                            
                            
                                    if (localSizeChoice==null){
                                         throw new org.apache.axis2.databinding.ADBException("SizeChoice cannot be null!!");
                                    }
                                    elementList.add(localSizeChoice);
                                

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
        public static SmartItemPlaceHolderInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SmartItemPlaceHolderInfo object =
                new SmartItemPlaceHolderInfo();

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
                    
                            if (!"SmartItemPlaceHolderInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SmartItemPlaceHolderInfo)com.eyeblaster.api.message.smart.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutoResize").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutoResize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutoResizeToHeight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutoResizeToHeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setAutoResizeToHeight(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAutoResizeToHeight(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutoResizeToWidth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutoResizeToWidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setAutoResizeToWidth(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAutoResizeToWidth(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FixedHeight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFixedHeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setFixedHeight(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFixedHeight(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FixedWidth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFixedWidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setFixedWidth(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFixedWidth(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","MaintainAspectRatio").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaintainAspectRatio(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","NotifyIncompatibleFileSize").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNotifyIncompatibleFileSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RangeFromHeight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRangeFromHeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRangeFromHeight(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRangeFromHeight(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RangeFromWidth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRangeFromWidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRangeFromWidth(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRangeFromWidth(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RangeToHeight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRangeToHeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRangeToHeight(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRangeToHeight(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RangeToWidth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRangeToWidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRangeToWidth(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRangeToWidth(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SizeChoice").equals(reader.getName())){
                                
                                                object.setSizeChoice(com.eyeblaster.api.v1.datacontracts.smart.SmartItemChoice.Factory.parse(reader));
                                              
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
           
          