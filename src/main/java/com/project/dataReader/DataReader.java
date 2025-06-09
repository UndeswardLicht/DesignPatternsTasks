package com.project.dataReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.project.customException.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataReader {
    private static final Logger logger = LoggerFactory.getLogger(DataReader.class);

    public List<String> readData(String filePath) {
        List<String> lines;
        Path path = Paths.get(filePath);
        try {
            if (Files.exists(path)) {
                logger.info("Reading data from file: {}", filePath);
                lines = Files.readAllLines(path);
                if (lines.isEmpty()) {
                    logger.error("Reading failed. File is empty: {}", filePath);
                    throw new InvalidDataFormatException(filePath, "Reading failed. File is empty");
                }
            } else {
                logger.error("File not found: {}", filePath);
                throw new FileReadingException(filePath, "File not found");
            }
        } catch (FileNotFoundException e) {
            logger.error("File not found: {}", filePath);
            throw new FileReadingException(filePath, "File not found", e);
        } catch (IOException e) {
            logger.error("Error reading file: {}", e.getMessage());
            throw new FileReadingException(filePath, e.getMessage(), e);
        }
        return lines;
    }
}
