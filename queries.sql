--Part 1

-- ID: INT
-- Employer: VARCHAR
-- Name: VARCHAR
-- Skills: VARCHAR

--Part 2

SELECT name
FROM employer
WHERE location = "St. Louis City";


--Part 3
DROP TABLE job;


--Part 4

--SELECT name
--FROM skill
--LEFT JOIN job_skills ON skill.id = job_skills.skills_id
--WHERE job_skills.jobs_id IS NOT null
--ORDER BY name ASC;

SELECT name FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
