// Task Routes

const express = require("express");
const taskController = require("../controllers/taskControllers");

const router = express.Router();

// endpoints - localhost:3000
router.route("/").get(taskController.getAllTask).post(taskController.createTask);

// endpoints - localhost:3000/:id
router.route("/:id").get(taskController.getOneTask);

module.exports = router;