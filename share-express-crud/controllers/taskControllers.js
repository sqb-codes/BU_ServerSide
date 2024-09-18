// Task controller - CRUD operations
const Task = require("../models/taskModels");

exports.getAllTask = async (req, res, next) => {
    try {
        const taskList = Task.find();
        res.status(200).json({
            status: "success",
            count: taskList.length,
            data: {
                taskList
            }
        });
    } catch (error) {
        res.status(400).json({
            status: "failed",
            description: "Cannot get task list"
        });
    }
}

exports.createTask = async (req, res, next) => {
    try {
        const taskList = Task.create(req.body);
        res.status(200).json({
            status: "success",
            data: {
                taskList
            }
        });
    } catch (error) {
        res.status(400).json({
            status: "failed",
            description: "Cannot create new task"
        });
    }
}

exports.getOneTask = async (req, res, next) => {
    try {
        const task = Task.create(req.param.id);
        res.status(200).json({
            status: "success",
            data: {
                taskList
            }
        });
    } catch (error) {
        res.status(400).json({
            status: "failed",
            description: "Cannot create new task"
        });
    }
}