
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

            package com.eyeblaster.api.message.analytics;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "ReportBase".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.analytics.ReportBase.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "char".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "guid".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "PerformanceReport".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.analytics.PerformanceReport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "APIDateTime".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.analytics.APIDateTime.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "duration".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V2/DataContracts".equals(namespaceURI) &&
                  "JobStatus".equals(typeName)){
                   
                            return  com.eyeblaster.api.v2.datacontracts.analytics.JobStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "DynamicPerformanceReport".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.analytics.DynamicPerformanceReport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.eyeblaster.com/V1/DataContracts".equals(namespaceURI) &&
                  "TimeZone".equals(typeName)){
                   
                            return  com.eyeblaster.api.v1.datacontracts.analytics.TimeZone.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    