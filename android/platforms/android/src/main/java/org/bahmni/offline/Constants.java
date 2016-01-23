package org.bahmni.offline;

public class Constants {
    public static String CREATE_PATIENT_TABLE = "CREATE TABLE IF NOT EXISTS patient (identifier TEXT, uuid TEXT PRIMARY KEY, givenName TEXT, middleName TEXT, familyName TEXT, gender TEXT, birthdate TEXT, dateCreated TEXT, patientJson TEXT, relationships TEXT)";
    public static String CREATE_PATIENT_ATTRIBUTE_TYPE_TABLE = "CREATE TABLE IF NOT EXISTS patient_attribute_types (attributeTypeId INTEGER, attributeName TEXT, uuid TEXT PRIMARY KEY, format TEXT);";
    public static String CREATE_PATIENT_ATTRIBUTE_TABLE = "CREATE TABLE IF NOT EXISTS patient_attributes (attributeTypeId INTEGER, attributeValue TEXT, patientUuid TEXT, uuid TEXT PRIMARY KEY);";
    public static String CREATE_EVENT_LOG_MARKER_TABLE = "CREATE TABLE IF NOT EXISTS event_log_marker (lastReadEventUuid TEXT, catchmentNumber TEXT PRIMARY KEY, lastReadTime DATETIME);";
    public static String CREATE_ADDRESS_HIERARCHY_ENTRY_TABLE = "CREATE TABLE IF NOT EXISTS address_hierarchy_entry (name TEXT, level_id INTEGER, parent_id INTEGER, user_generated_id TEXT, uuid TEXT PRIMARY KEY);";
    public static String CREATE_ADDRESS_HIERARCHY_LEVEL_TABLE = "CREATE TABLE IF NOT EXISTS address_hierarchy_entry (address_hierarchy_level_id INTEGER, name TEXT, parent_level_id INTEGER, address_field TEXT, uuid TEXT PRIMARY KEY, required INTEGER);";
    public static String CREATE_PATIENT_ADDRESS_TABLE = "CREATE TABLE IF NOT EXISTS patient_address (address1 TEXT, address2 TEXT, city_village TEXT, state_province TEXT, postal_code TEXT, country TEXT, county_district TEXT, address3 TEXT, address4 TEXT, address5 TEXT, address6 TEXT, patientUuid INTEGER PRIMARY KEY);";
    public static String CREATE_IDGEN_TABLE = "CREATE TABLE IF NOT EXISTS idgen (identifier INTEGER PRIMARY KEY);";
    public static String CREATE_GIVEN_NAME_INDEX = "CREATE INDEX IF NOT EXISTS givenNameIndex ON patient(givenName);";
    public static String CREATE_MIDDLE_NAME_INDEX = "CREATE INDEX IF NOT EXISTS middleNameIndex ON patient(middleName);";
    public static String CREATE_FAMILY_NAME_INDEX = "CREATE INDEX IF NOT EXISTS familyNameIndex ON patient(familyName);";
    public static String CREATE_IDENTIFIER_INDEX = "CREATE INDEX IF NOT EXISTS identifierIndex ON patient(identifier);";

    public static String KEY = "key";
}
