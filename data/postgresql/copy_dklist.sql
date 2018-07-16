COPY data.dklist(profile_id,species_id,bird_name,latin_bird_name,rec_date,rec_location,latitude,longitude,rec_map)
    FROM '/Users/theoaskov/Downloads/dklist.csv' DELIMITER ';' CSV HEADER;