package gr.aueb.cf.schoolapp.validator;

import gr.aueb.cf.schoolapp.DTO.UserInsertDTO;
import gr.aueb.cf.schoolapp.dao.IUserDAO;
import gr.aueb.cf.schoolapp.dao.UserDAOImpl;
import gr.aueb.cf.schoolapp.service.IUserService;
import gr.aueb.cf.schoolapp.service.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserInputValidator {
    private static final IUserDAO userDAO = new UserDAOImpl();
    private static final IUserService userService = new UserServiceImpl(userDAO);

    private UserInputValidator() {

    }
    public static <T extends UserInsertDTO>Map<String, String> validate(T dto) {
        Map<String, String> errors = new HashMap<String, String>();

        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            errors.put("confirm password", "passwords do not match");
        }
        if (userService.isEmailExists(dto.getUsername())){
            errors.put("username", "username already exists");
        }
        return errors;
    }
}
