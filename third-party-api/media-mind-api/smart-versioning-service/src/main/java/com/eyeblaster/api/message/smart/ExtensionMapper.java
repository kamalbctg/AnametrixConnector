
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

            package com.eyeblaster.api.message.smart;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SmartVersioningType".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SmartVersioningType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "AssetSmartItemInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.AssetSmartItemInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "APIDateTime".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.APIDateTime.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SmartItemTypeV2".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SmartItemTypeV2.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SmartItemInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SmartItemInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "char".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SmartItemStatus".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SmartItemStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SmartItemPlaceHolderInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SmartItemPlaceHolderInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SVProVersionInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SVProVersionInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "guid".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "TextSmartItemInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.TextSmartItemInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "SmartItemChoice".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.SmartItemChoice.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "ArrayOfSmartItemInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.ArrayOfSmartItemInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "BasicInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.BasicInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "duration".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "ArrayOfBasicInfo".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.ArrayOfBasicInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "TimeZone".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.TimeZone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "FontWeight".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.smart.FontWeight.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    