-- Create Table message
DROP TABLE IF EXISTS `post`;
CREATE TABLE IF NOT EXISTS `post` (
	`ID` int(32) AUTO_INCREMENT PRIMARY KEY,
	`AUTHOR` varchar(32) NOT NULL,
	`MESSAGE` varchar(256) NOT NULL,
	`TIME` TIMESTAMP NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Add test entry
DELETE FROM `post`;
INSERT INTO post (`AUTHOR`, `MESSAGE`, `TIME`) VALUES ('admin', 'this is a good', '2019-11-02');
