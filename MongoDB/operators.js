db.students.find({"student_details.batch" : 2022 });

db.students.find({"student_details.batch" : {$eq : 2022} });

db.students.find({"student_details.batch" : {$ne : 2022} });

db.students.find({"student_details.batch" : {$gt : 2022} });

db.students.find({"student_details.batch" : {$gte : 2022} });

db.students.find({"student_details.batch" : {$lt : 2022} });

db.students.find({"student_details.batch" : {$lte : 2022} });

db.students.find({$and : [{"student_details.year" : 3}, {"student_details.sem" : 5}]});

db.students.find({$or : [{"student_details.year" : 3}, {"student_details.sem" : 5}]});

db.students.find({$or : [{name : "Ram"}, {name : "Aman"}]});

db.students.find({$or : [{name : "Ram"}, {name : "Aman"}, {name : "Naman"}, {name : "Sumit"}]});

db.students.find({name : {$in : ["Ram", "Aman", "Naman", "Sumit"]}});

db.students.find({name : {$nin : ["Ram", "Aman", "Naman", "Sumit"]}});

db.students.find({$and : [{"student_details.batch" : {$gt : 2022} }, {"student_details.sem" : 5}]});

db.students.find({hobbies : "cricket"}, {name : 1, hobbies : 1, _id : 0});

db.students.findOne({hobbies : "cricket"}, {name : 1, hobbies : 1, _id : 0}).hobbies[0];
db.students.findOne({hobbies : "cricket"}, {name : 1, hobbies : 1, _id : 0}).hobbies[1];
db.students.findOne({hobbies : "cricket"}, {name : 1, hobbies : 1, _id : 0}).hobbies[2];