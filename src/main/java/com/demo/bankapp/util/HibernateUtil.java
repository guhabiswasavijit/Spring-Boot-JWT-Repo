package com.demo.bankapp.util;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import com.demo.bankapp.model.User;
public class HibernateUtil {

	public static void main(String[] args) {
		Map<String, String> settings = new HashMap<>();
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/imagecatalog");
        settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
        settings.put(Environment.USER,"root");
        settings.put(Environment.PASS,"Swam2@mysql");

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(settings).build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.addAnnotatedClass(User.class);
        Metadata metadata = metadataSources.buildMetadata();

        SchemaExport schemaExport = new SchemaExport();
        schemaExport.setFormat(true);
        schemaExport.setOutputFile("D:\\workspace\\create.sql");
        schemaExport.createOnly(EnumSet.of(TargetType.SCRIPT), metadata);

	}

}
