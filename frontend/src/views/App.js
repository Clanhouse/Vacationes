import { BrowserRouter as Router, Route, Redirect } from 'react-router-dom';
import MainTemplate from 'components/templates/MainTemplate';

const App = () => {
  return (
    <MainTemplate>
      <Router>
        <Route path="/login">
          <p>login page</p>
        </Route>
        <Route path="/register">
          <p>register page</p>
        </Route>
        <Route path="/forgot-password">
          <p>forgot-password page</p>
        </Route>
        <Route path="/favorites">
          <p>favorites page</p>
        </Route>
        <Route path="/" exact>
          <Redirect to="/login" />
        </Route>
      </Router>
    </MainTemplate>
  );
};

export default App;
