import db_helper



def test_verify_get_user_data():

    expect = 'andy lai'

    result = db_helper.get_user_data()

    assert expect == result

def test_verify_create_user():

    expect = True
    result = db_helper.create_user()

    assert expect == result
