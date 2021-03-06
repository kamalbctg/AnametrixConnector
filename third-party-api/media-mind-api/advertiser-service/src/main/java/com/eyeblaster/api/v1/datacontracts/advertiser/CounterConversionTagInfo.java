
/**
 * CounterConversionTagInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.eyeblaster.api.v1.datacontracts.advertiser;
            

            /**
            *  CounterConversionTagInfo bean class
            */
        
        public  class CounterConversionTagInfo extends com.eyeblaster.api.v1.datacontracts.advertiser.ConversionTagInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CounterConversionTagInfo
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
                        * field for ConversionValue
                        */

                        
                                    protected double localConversionValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getConversionValue(){
                               return localConversionValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConversionValue
                               */
                               public void setConversionValue(double param){
                            
                                            this.localConversionValue=param;
                                    

                               }
                            

                        /**
                        * field for CountConversions
                        */

                        
                                    protected com.eyeblaster.api.v1.datacontracts.advertiser.CountConversions localCountConversions ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.eyeblaster.api.v1.datacontracts.CountConversions
                           */
                           public  com.eyeblaster.api.v1.datacontracts.advertiser.CountConversions getCountConversions(){
                               return localCountConversions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountConversions
                               */
                               public void setCountConversions(com.eyeblaster.api.v1.datacontracts.advertiser.CountConversions param){
                            
                                            this.localCountConversions=param;
                                    

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
                       CounterConversionTagInfo.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":CounterConversionTagInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CounterConversionTagInfo",
                           xmlWriter);
                   }

               
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ID");
                                    }
                                
                                               if (localID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdvertiserID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdvertiserID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdvertiserID");
                                    }
                                
                                               if (localAdvertiserID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AdvertiserID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdvertiserName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdvertiserName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdvertiserName");
                                    }
                                

                                          if (localAdvertiserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdvertiserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localAdvertiserPageType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdvertiserPageType cannot be null!!");
                                            }
                                           localAdvertiserPageType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserPageType"),
                                               factory,xmlWriter);
                                         if (localAdvertiserPageURLTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdvertiserPageURL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdvertiserPageURL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdvertiserPageURL");
                                    }
                                

                                          if (localAdvertiserPageURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdvertiserPageURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAssignToCampaignsTracker){
                                    if (localAssignToCampaigns==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AssignToCampaigns", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AssignToCampaigns");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AssignToCampaigns");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAssignToCampaigns.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AssignToCampaigns"),
                                        factory,xmlWriter);
                                    }
                                }
                                    if (localConversionTagExtendedInfo==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ConversionTagExtendedInfo", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ConversionTagExtendedInfo");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ConversionTagExtendedInfo");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localConversionTagExtendedInfo.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionTagExtendedInfo"),
                                        factory,xmlWriter);
                                    }
                                
                                            if (localConversionTagStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConversionTagStatus cannot be null!!");
                                            }
                                           localConversionTagStatus.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionTagStatus"),
                                               factory,xmlWriter);
                                         if (localGroup1Tracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Group1", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Group1");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Group1");
                                    }
                                

                                          if (localGroup1==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGroup1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroup2Tracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Group2", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Group2");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Group2");
                                    }
                                

                                          if (localGroup2==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGroup2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroup3Tracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Group3", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Group3");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Group3");
                                    }
                                

                                          if (localGroup3==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGroup3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroup4Tracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Group4", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Group4");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Group4");
                                    }
                                

                                          if (localGroup4==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGroup4);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroup5Tracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Group5", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Group5");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Group5");
                                    }
                                

                                          if (localGroup5==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGroup5);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReportingNameTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReportingName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReportingName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReportingName");
                                    }
                                

                                          if (localReportingName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportingName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SendAlert", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SendAlert");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SendAlert");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SendAlert cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendAlert));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SendAlertForConversionsAmount", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SendAlertForConversionsAmount");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SendAlertForConversionsAmount");
                                    }
                                

                                          if (localSendAlertForConversionsAmount==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SendAlertForConversionsAmount cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendAlertForConversionsAmount));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localSendAlertTimeRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SendAlertTimeRange cannot be null!!");
                                            }
                                           localSendAlertTimeRange.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SendAlertTimeRange"),
                                               factory,xmlWriter);
                                        
                                            if (localServerProtocol==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServerProtocol cannot be null!!");
                                            }
                                           localServerProtocol.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServerProtocol"),
                                               factory,xmlWriter);
                                        
                                            if (localType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
                                            }
                                           localType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Type"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ConversionValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ConversionValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ConversionValue");
                                    }
                                
                                               if (java.lang.Double.isNaN(localConversionValue)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ConversionValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConversionValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localCountConversions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CountConversions cannot be null!!");
                                            }
                                           localCountConversions.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CountConversions"),
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CounterConversionTagInfo"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdvertiserID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdvertiserName"));
                                 
                                         elementList.add(localAdvertiserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserName));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdvertiserPageType"));
                            
                            
                                    if (localAdvertiserPageType==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdvertiserPageType cannot be null!!");
                                    }
                                    elementList.add(localAdvertiserPageType);
                                 if (localAdvertiserPageURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdvertiserPageURL"));
                                 
                                         elementList.add(localAdvertiserPageURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserPageURL));
                                    } if (localAssignToCampaignsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AssignToCampaigns"));
                            
                            
                                    elementList.add(localAssignToCampaigns==null?null:
                                    localAssignToCampaigns);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ConversionTagExtendedInfo"));
                            
                            
                                    elementList.add(localConversionTagExtendedInfo==null?null:
                                    localConversionTagExtendedInfo);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ConversionTagStatus"));
                            
                            
                                    if (localConversionTagStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConversionTagStatus cannot be null!!");
                                    }
                                    elementList.add(localConversionTagStatus);
                                 if (localGroup1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Group1"));
                                 
                                         elementList.add(localGroup1==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup1));
                                    } if (localGroup2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Group2"));
                                 
                                         elementList.add(localGroup2==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup2));
                                    } if (localGroup3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Group3"));
                                 
                                         elementList.add(localGroup3==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup3));
                                    } if (localGroup4Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Group4"));
                                 
                                         elementList.add(localGroup4==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup4));
                                    } if (localGroup5Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Group5"));
                                 
                                         elementList.add(localGroup5==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup5));
                                    } if (localReportingNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ReportingName"));
                                 
                                         elementList.add(localReportingName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportingName));
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SendAlert"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendAlert));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SendAlertForConversionsAmount"));
                                 
                                        if (localSendAlertForConversionsAmount != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendAlertForConversionsAmount));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SendAlertForConversionsAmount cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SendAlertTimeRange"));
                            
                            
                                    if (localSendAlertTimeRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("SendAlertTimeRange cannot be null!!");
                                    }
                                    elementList.add(localSendAlertTimeRange);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServerProtocol"));
                            
                            
                                    if (localServerProtocol==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServerProtocol cannot be null!!");
                                    }
                                    elementList.add(localServerProtocol);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Type"));
                            
                            
                                    if (localType==null){
                                         throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
                                    }
                                    elementList.add(localType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ConversionValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConversionValue));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CountConversions"));
                            
                            
                                    if (localCountConversions==null){
                                         throw new org.apache.axis2.databinding.ADBException("CountConversions cannot be null!!");
                                    }
                                    elementList.add(localCountConversions);
                                

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
        public static CounterConversionTagInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CounterConversionTagInfo object =
                new CounterConversionTagInfo();

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
                    
                            if (!"CounterConversionTagInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CounterConversionTagInfo)com.eyeblaster.api.message.advertiser.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdvertiserID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdvertiserName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserPageType").equals(reader.getName())){
                                
                                                object.setAdvertiserPageType(com.eyeblaster.api.v1.datacontracts.advertiser.AdvertiserPageTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserPageURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdvertiserPageURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AssignToCampaigns").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAssignToCampaigns(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAssignToCampaigns(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfunsignedInt.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionTagExtendedInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setConversionTagExtendedInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setConversionTagExtendedInfo(com.eyeblaster.api.v1.datacontracts.advertiser.ConversionTagExtendedInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionTagStatus").equals(reader.getName())){
                                
                                                object.setConversionTagStatus(com.eyeblaster.api.v1.datacontracts.advertiser.ConversionTagStatuses.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Group1").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroup1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Group2").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroup2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Group3").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroup3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Group4").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroup4(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Group5").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroup5(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ReportingName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportingName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SendAlert").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendAlert(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SendAlertForConversionsAmount").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendAlertForConversionsAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SendAlertTimeRange").equals(reader.getName())){
                                
                                                object.setSendAlertTimeRange(com.eyeblaster.api.v1.datacontracts.advertiser.SendAlertTimeRanges.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServerProtocol").equals(reader.getName())){
                                
                                                object.setServerProtocol(com.eyeblaster.api.v1.datacontracts.advertiser.ServerProtocols.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Type").equals(reader.getName())){
                                
                                                object.setType(com.eyeblaster.api.v1.datacontracts.advertiser.ConversionTagTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConversionValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CountConversions").equals(reader.getName())){
                                
                                                object.setCountConversions(com.eyeblaster.api.v1.datacontracts.advertiser.CountConversions.Factory.parse(reader));
                                              
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
           
          