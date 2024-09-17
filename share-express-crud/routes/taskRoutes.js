// Task Routes
const express = require("express");
const taskController = require("../controllers/taskController");
const router = express.Router();


// localhost:3000/
router.route("/").get(taskController.getAllTasks).post(taskController.createTask);


// localhost:3000/:101
router.route("/:id").get(taskController.getOneTask);

module.exports = router;